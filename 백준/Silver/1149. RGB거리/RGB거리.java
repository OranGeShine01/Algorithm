import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] cost; // 각 비용을 담을 배열
    static int n;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        cost = new int[n][3];
        dp = new int[n][3];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<=2; j++) {
                cost[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<=2; i++) {
            dp[0][i] = cost[0][i];
        }

        System.out.println(Math.min(Math.min(coloring(n-1, 0), coloring(n-1, 1)), coloring(n-1, 2)));
    }

    // 색칠하기
    static int coloring(int n, int color) {

        // 탐색하지 않은 배열인 경우, 탐색하여 값을 입력한다.
        if (dp[n][color] == 0) {

            if (color==0) {
                dp[n][color] = Math.min(coloring(n-1, 1), coloring(n-1, 2)) + cost[n][color];
            }

            else if (color==1) {
                dp[n][color] = Math.min(coloring(n-1, 0), coloring(n-1, 2)) + cost[n][color];
            }

            else if (color==2) {
                dp[n][color] = Math.min(coloring(n-1, 0), coloring(n-1, 1)) + cost[n][color];
            }
        }
        
        return dp[n][color];
    }
}

