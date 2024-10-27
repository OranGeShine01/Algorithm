import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        final int maxValue = 10000000;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder answer = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[][] graph = new int[n + 1][n + 1];

//        초기화
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                graph[i][j] = (i == j) ? 0 : maxValue;
            }
        }

//        인접행렬에 입력값 입력
        for (int i = 0; i < m; i++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);

            graph[a][b] = Math.min(graph[a][b], c);
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    int costWithK = graph[i][k] + graph[k][j];
                    if (graph[i][j] > costWithK) {
                        graph[i][j] = costWithK;
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (graph[i][j] == maxValue) answer.append(0).append(' ');
                else answer.append(graph[i][j]).append(' ');
            }
            answer.append('\n');
        }

        bw.append(answer);
        bw.flush();
        bw.close();
        br.close();

    }
}
