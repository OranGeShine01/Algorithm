import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        while (t > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] inputs = new int[2][n];
            int[][] dp = new int[2][n];

            for (int i = 0; i < 2; i++) {
                String[] str = br.readLine().split(" ");
                for (int j = 0; j < n; j++) {
                    inputs[i][j] = Integer.parseInt(str[j]);
                }
            }

//            initialize dp
            dp[0][0] = inputs[0][0];
            dp[1][0] = inputs[1][0];
            if (n > 1) {
                dp[0][1] = dp[1][0] + inputs[0][1];
                dp[1][1] = dp[0][0] + inputs[1][1];
            }

            for (int i = 2; i < n; i ++) {
                for (int j = 0; j < 2; j++) {
                    int otherRow = 1 - j;
                    dp[j][i] = Math.max(dp[otherRow][i - 2], dp[otherRow][i - 1]) + inputs[j][i];
                }
            }

            answer.append(Math.max(dp[0][n - 1], dp[1][n - 1])).append('\n');
            t--;
        }

        bw.append(answer);
        bw.flush();
        bw.close();
        br.close();

    }
}
