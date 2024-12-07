import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
//        dp[i][j] = i부터 j까지 연산최소횟수
        int[][] dp = new int[n][n];
        int[][] matrixes = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");
            matrixes[i][0] = Integer.parseInt(inputs[0]);
            matrixes[i][1] = Integer.parseInt(inputs[1]);
        }

        for (int k = 1; k < n; k++) {
            for (int i = 0; i < n - k; i++) {
                int j = i + k;
                dp[i][j] = Integer.MAX_VALUE;
                for (int l = i; l < j; l++) {
                    int cost = dp[i][l] + dp[l + 1][j] + matrixes[i][0] * matrixes[l][1] * matrixes[j][1];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }

        bw.append(String.valueOf(dp[0][n - 1]));
        bw.close();
        br.close();
    }
}