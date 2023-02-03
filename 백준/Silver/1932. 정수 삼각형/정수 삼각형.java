import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] tri;
    static Integer[][] dp;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        tri = new int[n][n];
        dp = new Integer[n][n];
        StringTokenizer st;
        for (int i=0; i<n; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            for (int j=0; j<=i; j++) {
                tri[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dp[0][0] = tri[0][0];
        int max = 0;
        for (int i=0; i<n; i++) {
            max = Math.max(max, dp(n-1, i));
        }
        System.out.println(max);
    }

    static int dp(int row, int col) {
        if (dp[row][col]==null) {
            if (col==0) {
                dp[row][col] = dp(row-1, col) + tri[row][col];
            }
            else if (col==row) {
                dp[row][col] = dp(row-1, col-1) + tri[row][col];
            }
            else {
                dp[row][col] = Math.max(dp(row-1, col-1), dp(row-1, col)) + tri[row][col];
            }
        }
        return dp[row][col];
    }
}