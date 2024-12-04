import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
//            dp[i][j] = i부터 j까지 파일 합치기 최소비용
            int[][] dp = new int[n + 1][n + 1];
            int[] sum = new int[n + 1];
            String[] inputs = br.readLine().split(" ");
            for (int i = 1; i <= n; i++) {
                sum[i] = sum[i - 1] + Integer.parseInt(inputs[i - 1]);
            }
//            range
            for (int k = 2; k <= n; k++) {
//                start range
                for (int i = 1; i <= n - k + 1; i++) {
//                    end index
                    int j = i + k - 1;
                    dp[i][j] = Integer.MAX_VALUE;
//                    mid range
                    for (int l = i; l < j; l++) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][l] + dp[l + 1][j] + sum[j] - sum[i - 1]);
                    }
                }
            }
            answer.append(dp[1][n]).append('\n');
        }

        bw.append(answer);
        bw.close();
        br.close();
    }
}