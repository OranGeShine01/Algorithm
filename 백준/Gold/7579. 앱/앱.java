import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        String[][] inputs = new String[2][n];
        int[][] memoryCosts = new int[2][n];

        for (int i = 0; i < 2; i++) {
            inputs[i] = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                memoryCosts[i][j] = Integer.parseInt(inputs[i][j]);
            }
        }

//        비활성화에 필요한 비용 합
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += memoryCosts[1][i];
        }

//      n번째 앱까지 사용한 최대 확보가능한 메모리값
        int[][] dp = new int[n][sum + 1];

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            int usingCost = memoryCosts[0][i];
            int deactivateCost = memoryCosts[1][i];

            for (int j = 0; j <= sum; j++) {
                if (i == 0) {
                     if (j >= deactivateCost) dp[i][j] = usingCost;
                } else {
                    if (j >= deactivateCost) dp[i][j] = Math.max(dp[i - 1][j - deactivateCost] + usingCost, dp[i - 1][j]);
                    else dp[i][j] = dp[i - 1][j];
                }
                if (dp[i][j] >= m) answer = Math.min(answer, j);
            }
        }

        bw.append(String.valueOf(answer));
        bw.close();
        br.close();
    }
}