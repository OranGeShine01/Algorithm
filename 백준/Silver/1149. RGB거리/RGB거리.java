import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    // 각 집의 색별 비용, 빨강, 초록, 파랑 순.
    static int[][] cost;
    // n번째 집까지, 규칙에 따라 칠하는 최소비용을 메모이제이션할 dp (각 열은 마지막 집의 색)
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        cost = new int[n][3];
        dp = new int[n+1][3];
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<3; j++) {
                 cost[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i=1; i<n+1; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + cost[i-1][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + cost[i-1][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + cost[i-1][2];
        }

        System.out.println(Math.min(Math.min(dp[n][0], dp[n][1]), dp[n][2]));

    }


}