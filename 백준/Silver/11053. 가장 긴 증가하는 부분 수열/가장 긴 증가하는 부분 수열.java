import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] input; // 입력값을 받는 배열
    static Integer[] dp; // 메모이제이션을 할 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        input = new int[n];
        dp = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 1;
        int max = 1; // 가장 긴 부분수열의 길이

        for (int i=1; i<n; i++) {
            max = Math.max(max, dp(i));
        }
        System.out.println(max);
    }

    // k번째 항이 포함된 가장 긴 부분수열의 길이를 구하는 메서드.
    static int dp(int k) {
        if (dp[k]==null) {
            dp[k] = 1; // 초기화
            for (int i=k-1; i>=0; i--) {
                if (input[i]<input[k]) {
                    dp[k] = Math.max(dp[k], dp(i)+1);
                }
            }

        }
        return dp[k];
    }

}