import java.io.BufferedWriter;
        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {

        int MOD = 10007;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        dp[1] = 1;
        if (n >= 2) dp[2] = 2;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = (dp[i - 1] % MOD + dp[i - 2] % MOD) % MOD;
        }

        bw.append(String.valueOf(dp[n]));
        bw.flush();
        bw.close();
        br.close();
    }
}
