import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        final int INF = 10000;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[][] graph = new int[n + 1][n + 1];

        // 초기화
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                graph[i][j] = INF;
            }
        }

        for (int i = 0; i < m; i++) {
            String[] str = br.readLine().split(" ");
            int left = Integer.parseInt(str[0]);
            int right = Integer.parseInt(str[1]);

            graph[left][right] = 1;
            graph[right][left] = 1;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (graph[i][k] + graph[k][j] < graph[i][j]) graph[i][j] = graph[i][k] + graph[k][j];
                }
            }
        }

        int answer = 0;
        int value = INF;

        for (int i = 1; i <= n; i++) {
            int max = 0;
            for (int j = 1; j <= n; j++) {
                if (i != j) max += graph[i][j];
            }
            if (max < value) {
                answer = i;
                value = max;
            }
        }

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
