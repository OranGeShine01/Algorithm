import java.io.*;

public class Main {

    static Integer[][] dp;
    static int[][] map;
    static int m, n;
    static final int[][] movingPatterns = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] mn = br.readLine().split(" ");
        m = Integer.parseInt(mn[0]);
        n = Integer.parseInt(mn[1]);

        map = new int[m][n];
        dp = new Integer[m][n];

        for (int i = 0; i < m; i++) {
            String[] inputs = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(inputs[j]);
            }
        }

        bw.append(String.valueOf(dfs(0, 0)));
        bw.close();
        br.close();
    }

    static int dfs(int x, int y) {
        if (x == m - 1 && y == n - 1) return 1;
        if (dp[x][y] != null) return dp[x][y];
        dp[x][y] = 0;
        for (int[] movingPattern : movingPatterns) {
            int nextX = x + movingPattern[0];
            int nextY = y + movingPattern[1];
            if (isRange(nextX, nextY) && map[x][y] > map[nextX][nextY]) dp[x][y] += dfs(nextX, nextY);
        }
        return dp[x][y];
    }

    static boolean isRange(int x, int y) {
        return (x >= 0 && x < m && y >= 0 && y < n);
    }
}