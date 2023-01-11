import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n;
    static int[][] s;
    static boolean[] visit; // 방문여부를 판별하는 배열
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        s = new int[n][n];
        visit = new boolean[n];
        StringTokenizer st;
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<n; j++) {
                s[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0, 0);
        System.out.println(min);
    }

    static void dfs(int index, int depth) {
        if (depth==n/2) {
            diff();
            return;
        }

        for (int i=index; i<n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                dfs(i+1,depth+1);
                visit[i] = false;
            }
        }
    }

    static void diff() {
        int teamStart = 0;
        int teamLink = 0;

        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                // i 번째 사람과 j 번째 사람이 true라면 스타트팀으로 점수 플러스
                if (visit[i] && visit[j]) {
                    teamStart += s[i][j];
                    teamStart += s[j][i];
                }
                // i 번째 사람과 j 번째 사람이 false라면 링크팀으로 점수 플러스
                else if (!visit[i] && !visit[j]) {
                    teamLink += s[i][j];
                    teamLink += s[j][i];
                }
            }
        }

        // 두 팀의 점수차이
        int ans = Math.abs(teamStart-teamLink);

        if (ans==0) {
            System.out.println(ans);
            System.exit(0);
        }

        min = Math.min(min, ans);
    }
}