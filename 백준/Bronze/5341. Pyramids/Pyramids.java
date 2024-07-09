import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            long n = Long.parseLong(br.readLine());
            if (n == 0) break;
            long ans = n * (n + 1) / 2;
            bw.append(String.valueOf(ans));
            bw.append('\n');
        }

        br.close();
        bw.close();
    }
}