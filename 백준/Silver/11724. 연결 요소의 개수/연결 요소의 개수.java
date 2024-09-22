import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        boolean[][] graph = new boolean[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            String[] uv = br.readLine().split(" ");
            int u = Integer.parseInt(uv[0]);
            int v = Integer.parseInt(uv[1]);
            graph[u][v] = true;
            graph[v][u] = true;
        }

        bw.append(String.valueOf(bfs(graph)));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int bfs(boolean[][] graph) {
        int n = graph.length - 1;
        boolean[] visited = new boolean[n + 1];
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (visited[i]) continue;
            Queue<Integer> q = new LinkedList<>();
            q.add(i);
            visited[i] = true;
            while (!q.isEmpty()) {
                int currentNode = q.poll();
                for (int j = 1; j <= n; j++) {
                    if (!visited[j] && graph[currentNode][j]) {
                        q.add(j);
                        visited[j] = true;
                    }
                }
            }
            result++;
        }
        return result;
    }
}
