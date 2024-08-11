import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        BigInteger n = new BigInteger(br.readLine());
        BigInteger m = new BigInteger(br.readLine());

        bw.append(String.valueOf(n.multiply(m)));
        bw.close();
    }
}