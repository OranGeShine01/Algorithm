import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] score;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        score = new int[n];
        dp = new Integer[n];
        for (int i=0; i<n; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = score[0];
        if (n>=2) {
            dp[1] = score[0] + score[1];
        }
        if (n>=3) {
            dp[2] = Math.max(score[0], score[1]) + score[2];
        }

        System.out.println(count(n-1));

    }

    // k+1번째 계단이 끝일때, 총점의 최댓값을 구하는 메서드.
    static int count(int k) {
        if (dp[k]==null) {
            dp[k] = Math.max(count(k-3) + score[k-1], count(k-2)) + score[k];
        }

        return dp[k];
    }
}