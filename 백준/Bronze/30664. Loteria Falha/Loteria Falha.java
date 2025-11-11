import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder ans = new StringBuilder();

        String line;
        while (!(line = br.readLine()).equals("0")) {
            BigInteger input = new BigInteger(line);
            String s = input.mod(BigInteger.valueOf(42)).equals(BigInteger.ZERO) ? "PREMIADO" : "TENTE NOVAMENTE";
            ans.append(s).append("\n");
        }

        bw.append(ans);
        bw.close();
        br.close();
    }
}