import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        BigInteger num1 = new BigInteger(str[0]);
        BigInteger num2 = new BigInteger(str[1]);
        bw.append(String.valueOf(num1.multiply(num2)));
        bw.close();

    }
}