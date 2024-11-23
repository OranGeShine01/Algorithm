import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        long start = 1;
        long end = (long)n * n;

        while (start < end) {
            long mid = (start + end) / 2;
            long cnt = 0;
            for (int i = 1; i <= n; i++) {
                cnt += Math.min(mid / i, n);
            }
            if (cnt >= k) end = mid;
            else start = mid + 1;
        }

        bw.append(String.valueOf(start));

        bw.flush();
        bw.close();
        br.close();
    }
}
