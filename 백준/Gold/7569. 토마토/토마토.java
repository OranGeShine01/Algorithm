import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int n;
    static int m;
    static int h;

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

        String[] mnh = br.readLine().split(" ");
        m = Integer.parseInt(mnh[0]);
        n = Integer.parseInt(mnh[1]);
        h = Integer.parseInt(mnh[2]);

        int[][][] graph = new int[n][m][h];
        boolean[][][] visited = new boolean[n][m][h];
        Queue<Node> q = new LinkedList<>();

        for (int k = 0; k < h; k++) {
            for (int i = 0; i < n; i++) {
                String[] str = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    graph[i][j][k] = Integer.parseInt(str[j]);

                    if (graph[i][j][k] == 1) {
                        q.add(new Node(new int[]{i, j, k}, 0));
                        visited[i][j][k] = true;

                    }
                }
            }
        }

        int answer = bfs(graph, visited, q);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < h; k++) {
                    if (graph[i][j][k] == 0 && !visited[i][j][k]) {
                        answer = -1;
                        break;
                    }
                }
                if (answer == -1) break;
            }
            if (answer == -1) break;
        }

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int bfs(int[][][] graph, boolean[][][] visited, Queue<Node> q) {
        int result = 0;
        final int[][] movingPatterns = {{-1, 0, 0}, {1, 0, 0}, {0, -1, 0}, {0, 1, 0}, {0, 0, -1}, {0, 0, 1}};

        while (!q.isEmpty()) {
            Node currentNode = q.poll();
            int[] coordinates = currentNode.coordinates;
            int currentDay = currentNode.day;

            for (int[] movingPattern : movingPatterns) {
                int x = coordinates[0] + movingPattern[0];
                int y = coordinates[1] + movingPattern[1];
                int z = coordinates[2] + movingPattern[2];
                if (isRange(x, y, z) && graph[x][y][z] != -1 && !visited[x][y][z]) {
                    q.add(new Node(new int[]{x, y, z}, currentDay + 1));
                    visited[x][y][z] = true;
                }
            }
            result = currentDay;
        }
        return result;
    }

    private static boolean isRange(int x, int y, int z) {
        return (x >= 0 && x < n && y >= 0 && y < m && z >= 0 && z < h);
    }
}
