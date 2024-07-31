import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        final int p = 20000303;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int len = str.length();
        long sum = 0;
        for (int i = 0; i < len; i++) {
            int num = str.charAt(i) - '0';
            sum = (sum * 10 + num) % p;
        }
        bw.append(String.valueOf(sum));
        bw.close();
    }
}