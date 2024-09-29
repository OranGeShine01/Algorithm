import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        final int MOD = 10007;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n];

        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            dp[i] = ((dp[i - 1] * 2) + ((i % 2 == 0) ? -1 : 1)) % MOD;
        }

        bw.append(String.valueOf(dp[n - 1]));
        bw.flush();
        bw.close();
        br.close();
    }
}
