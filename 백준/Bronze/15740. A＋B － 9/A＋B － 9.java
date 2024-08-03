import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        BigInteger A = new BigInteger(str[0]);
        BigInteger B = new BigInteger(str[1]);

        bw.append(String.valueOf(A.add(B)));
        bw.close();
    }
}