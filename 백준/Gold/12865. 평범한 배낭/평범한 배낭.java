import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n, k;

    // 무게제한 y, x번째 물건까지 탐색하여 메모이제이션
    static Integer[][] dp;

    // 각 물건의 무게와 가치를 저장할 배열
    static int[][] wv;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        wv = new int[n][2];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            wv[i][0] = Integer.parseInt(st.nextToken());
            wv[i][1] = Integer.parseInt(st.nextToken());
        }
        dp = new Integer[n+1][k+1];

        // dp의 0행, 0열은 0으로 초기화.
        for (int i=0; i<=n; i++) {
            dp[i][0] = 0;
        }
        for (int i=1; i<=k; i++) {
            dp[0][i] = 0;
        }
        System.out.println(dp(n, k));
    }

    // dp의 x행, y열 값을 구하는 method
    static int dp(int x, int y) {
        if (dp[x][y]==null) {
            dp[x][y] = dp(x-1, y); // 초기화
            if (y>=wv[x-1][0]) {
                dp[x][y] = Math.max(dp[x - 1][y], dp(x - 1, y - wv[x-1][0]) + wv[x-1][1]);
            }
        }
        return dp[x][y];
    }
}