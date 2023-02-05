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
        long ans = 0;
        for (int i = 0; i < 10; i++) {
            ans += stair(i, n - 1);
        }
        System.out.println(ans%mod);
    }

    // 재귀를 통해 계단수를 구하는 메서드. k=직전 자리의 숫자, n=자릿수.
    static long stair(int k, int n) {
        if (dp[k][n]==null) {
            if (k==0) {
                dp[k][n] = stair(1, n-1);
            }
            else if (k==9) {
                dp[k][n] = stair(8, n-1);
            }
            else {
                dp[k][n] = stair(k-1, n-1) + stair(k+1, n-1);
            }
        }
        return dp[k][n] % mod;
    }
}