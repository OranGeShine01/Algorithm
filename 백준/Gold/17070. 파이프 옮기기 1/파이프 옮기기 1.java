import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(inputs[j]);
            }
        }

//        dp, 0 = 가로, 1 = 세로, 2 = 대각선
        int[][][] dp = new int[n][n][3];
//        초기값 0, 1에 가로파이프 배치
        dp[0][1][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 2; j < n; j++) {
                if (map[i][j] == 1) continue;
//                i, j에 가로파이프 배치
                if (map[i][j - 1] == 0) {
                    dp[i][j][0] += dp[i][j - 1][0] + dp[i][j - 1][2];
                }

//                i, j에 세로파이프 배치
                if (i > 0 && map[i - 1][j] == 0) {
                    dp[i][j][1] += dp[i - 1][j][1] + dp[i - 1][j][2];
                }

//                i, j에 대각선파이프 배치
                if (i > 0 && map[i -1][j - 1] == 0 && map[i][j - 1] == 0 && map[i - 1][j] == 0) {
                    dp[i][j][2] += dp[i - 1][j - 1][0] + dp[i - 1][j - 1][1] + dp[i - 1][j - 1][2];
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < dp[0][0].length; i++) {
            ans += dp[n - 1][n - 1][i];
        }

        bw.append(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
    }
}
