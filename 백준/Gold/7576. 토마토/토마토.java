import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int n;
    static int m;

    static class Node {
        int[] coordinates;
        int day;

        public Node(int[] coordinates, int day) {
            this.coordinates = coordinates;
            this.day = day;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] mn = br.readLine().split(" ");
        m = Integer.parseInt(mn[0]);
        n = Integer.parseInt(mn[1]);

        int[][] graph = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        Queue<Node> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                graph[i][j] = Integer.parseInt(str[j]);
                if (graph[i][j] == 1) {
                    q.add(new Node(new int[]{i, j}, 0));
                    visited[i][j] = true;
                }
            }
        }

        int answer = bfs(graph, visited, q);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 0 && !visited[i][j]) {
                    answer = -1;
                    break;
                }
            }
            if (answer == -1) break;
        }

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int bfs(int[][] graph, boolean[][] visited, Queue<Node> q) {
        int result = 0;
        final int[][] movingPatterns = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!q.isEmpty()) {
            Node currentNode = q.poll();
            int[] coordinates = currentNode.coordinates;
            int currentDay = currentNode.day;

            for (int[] movingPattern : movingPatterns) {
                int x = coordinates[0] + movingPattern[0];
                int y = coordinates[1] + movingPattern[1];
                if (isRange(x, y) && graph[x][y] != -1 && !visited[x][y]) {
                    q.add(new Node(new int[]{x, y}, currentDay + 1));
                    visited[x][y] = true;
                }
            }
            result = currentDay;
        }
        return result;
    }

    private static boolean isRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }
}
