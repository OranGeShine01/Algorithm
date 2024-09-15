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

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String[] mnk = br.readLine().split(" ");
            int m = Integer.parseInt(mnk[0]);
            int n = Integer.parseInt(mnk[1]);
            int k = Integer.parseInt(mnk[2]);

            int[][] map = new int[m][n];
            int[][] coordinates = new int[k][2];
            for (int j = 0; j < k; j++) {
                String[] xy = br.readLine().split(" ");
                int x = Integer.parseInt(xy[0]);
                int y = Integer.parseInt(xy[1]);
                map[x][y] = 1;
                coordinates[j] = new int[]{x, y};
            }

            boolean[][] visited = new boolean[m][n];
            int count = 0;

            for (int j = 0; j < k; j++) {
                int x = coordinates[j][0];
                int y = coordinates[j][1];
                if (!visited[x][y] && map[x][y] == 1) {
                    bfs(coordinates[j], map, visited);
                    count++;
                }
            }
            sb.append(count).append('\n');
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }

    static void bfs(int[] coordinate, int[][] map, boolean[][] visited) {

        final int[][] movingPatterns = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int m = map.length;
        int n = map[0].length;
        Queue<int[]> q = new LinkedList<>();

        q.add(coordinate);

        int x = coordinate[0];
        int y = coordinate[1];

        visited[x][y] = true;

        while (!q.isEmpty()) {
            int[] currentNode = q.poll();
            for (int[] movingPattern : movingPatterns) {
                int nextX = currentNode[0] + movingPattern[0];
                int nextY = currentNode[1] + movingPattern[1];
                if (isRange(nextX, nextY, m, n) && !visited[nextX][nextY] && map[nextX][nextY] == 1) {
                    visited[nextX][nextY] = true;
                    q.add(new int[]{nextX, nextY});
                }
            }
        }
    }

    static boolean isRange(int x, int y, int m, int n) {
        return (x >= 0 && y >= 0 && x < m && y < n);
    }
}
