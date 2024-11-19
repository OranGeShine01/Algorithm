import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigDecimal input = new BigDecimal(br.readLine());
        BigDecimal answer = input.setScale(0, RoundingMode.FLOOR);

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
