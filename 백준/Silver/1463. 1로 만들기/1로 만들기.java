import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n+1];
        dp[1] = 0;
        System.out.println(dp(n));

    }

    //연산의 최솟값을 구하는 메서드.
    static Integer dp(int k) {
        if (dp[k]==null) {
            if (k%3==0 && k%2==0) {
                dp[k] = Math.min(Math.min(dp(k/3), dp(k/2)),dp(k-1)) + 1;
            }
            else if (k%2==0) {
                dp[k] = Math.min(dp(k/2), dp(k-1)) + 1;
            }
            else if (k%3==0){
                dp[k] = Math.min(dp(k/3), dp(k-1)) + 1;
            }
            else {
                dp[k] = dp(k-1) + 1;
            }
        }
        return dp[k];
    }
}