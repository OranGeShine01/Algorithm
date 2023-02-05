import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Long[][] dp; // 마지막 수와 자릿수에 따른 계단수의 갯수를 저장할 배열.
    final static long mod = 1000000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Long[10][n];
        dp[0][0] = 0L;
        for (int i=1; i<=9; i++) {
            dp[i][0] = 1L;
        }

        for (int i=1; i<n; i++) {
            for (int j=0; j<10; j++) {
                if (j==0) {
                    dp[j][i] = dp[1][i-1]%mod;
                }
                else if (j==9) {
                    dp[j][i] = dp[8][i-1]%mod;
                }
                else {
                    dp[j][i] = (dp[j-1][i-1] + dp[j+1][i-1])%mod;
                }
            }
        }

        long ans = 0;
        for (int i = 0; i < 10; i++) {
            ans += dp[i][n-1];
        }
        System.out.println(ans%mod);
    }
}