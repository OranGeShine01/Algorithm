    import java.io.*;
    import java.time.LocalDate;
    import java.time.ZoneOffset;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            LocalDate localDate = LocalDate.now(ZoneOffset.UTC);
            StringBuilder ans = new StringBuilder();

            ans.append(localDate.getYear()).append('\n').append(localDate.getMonthValue()).append('\n').append(localDate.getDayOfMonth());

            bw.append(ans);
            bw.close();
        }
    }