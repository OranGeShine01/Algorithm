import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][3];
        int[][][] dp = new int[n][2][3];

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < 3; j++) {
                map[i][j] = Integer.parseInt(str[j]);
            }
        }

        dp[0][0] = map[0];
        dp[0][1] = map[0];

        for (int i = 1; i < n; i++) {
            int prev = i - 1;
            int leftMax = Math.max(dp[prev][0][0], dp[prev][0][1]);
            int leftMin = Math.min(dp[prev][1][0], dp[prev][1][1]);
            int rightMax = Math.max(dp[prev][0][2], dp[prev][0][1]);
            int rightMin = Math.min(dp[prev][1][2], dp[prev][1][1]);
            int midMax = Math.max(leftMax, rightMax);
            int midMin = Math.min(leftMin, rightMin);

            dp[i][0][0] = leftMax + map[i][0];
            dp[i][0][1] = midMax + map[i][1];
            dp[i][0][2] = rightMax + map[i][2];
            dp[i][1][0] = leftMin + map[i][0];
            dp[i][1][1] = midMin + map[i][1];
            dp[i][1][2] = rightMin + map[i][2];
        }

        int lastIndex = n - 1;

        int[] maxArray = dp[lastIndex][0];
        int max = 0;

        for (int i : maxArray) {
            max = Math.max(i, max);
        }

        int[] minArray = dp[lastIndex][1];
        int min = Integer.MAX_VALUE;

        for (int i : minArray) {
            min = Math.min(i, min);
        }

        bw.append(String.valueOf(max)).append(" ").append(String.valueOf(min));
        bw.flush();
        bw.close();
        br.close();
    }
}
