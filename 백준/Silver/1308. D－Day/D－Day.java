import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String today = br.readLine();
        String dday = br.readLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("y M d");
        LocalDate todayDate = LocalDate.parse(today, formatter);
        LocalDate ddayDate = LocalDate.parse(dday, formatter);
        if (isThousandYearsGap(todayDate, ddayDate)) bw.append("gg");
        else bw.append("D-" + String.valueOf(ChronoUnit.DAYS.between(todayDate, ddayDate)));

        bw.flush();
        br.close();
        bw.close();
    }

    static private boolean isThousandYearsGap(LocalDate startDate, LocalDate endDate) {
        LocalDate newDate = startDate.plusYears(1000);
        return !newDate.isAfter(endDate);
    }
}