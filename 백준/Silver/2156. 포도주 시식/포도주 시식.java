import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Integer[] dp; // n번째 포도주의 최대값을 저장할 배열.
    static int[] input; // 각 포도주 잔의 입력값을 저장할 배열.


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n+1];
        input = new int[n+1];

        for (int i=1; i<=n; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        //초기값 설정 (n=1과 n=2)
        dp[0] = 0;
        dp[1] = input[1];
        if (n>1) {
            dp[2] = input[1] + input[2];
        }
        for (int i=3; i<=n; i++) {
            dp[i] = Math.max(Math.max(dp[i-3] + input[i-1], dp[i-2]) + input[i], dp[i-1]);
        }
        System.out.println(dp[n]);
    }

}