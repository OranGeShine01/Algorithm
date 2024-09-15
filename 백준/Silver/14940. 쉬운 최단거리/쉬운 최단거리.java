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

        int[][] map = new int[n][m];
        int[] start = new int[2];
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(str[j]);
                if (map[i][j] == 2) {
                    start[0] = i;
                    start[1] = j;
                }
            }
        }

        int[][] result = bfs(start, map);

        StringBuilder sb = new StringBuilder();
        for (int[] resultRow : result) {
            for (int i : resultRow) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }

    static int[][] bfs(int[] start, int[][] map) {

        final int[][] movingPatterns = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int n = map.length;
        int m = map[0].length;
        int[][] result = new int[n][m];
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        q.add(start);

        int x = start[0];
        int y = start[1];

        visited[x][y] = true;
        while (!q.isEmpty()) {
            int[] currentNode = q.poll();
            int currentX = currentNode[0];
            int currentY = currentNode[1];
            for (int[] movingPattern : movingPatterns) {
                int nextX = currentNode[0] + movingPattern[0];
                int nextY = currentNode[1] + movingPattern[1];
                if (isRange(nextX, nextY, n, m) && !visited[nextX][nextY] && map[nextX][nextY] == 1) {
                    visited[nextX][nextY] = true;
                    result[nextX][nextY] = result[currentX][currentY] + 1;
                    q.add(new int[]{nextX, nextY});
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (result[i][j] == 0 && map[i][j] == 1) result[i][j] = -1;
            }
        }
        return result;
    }

    static boolean isRange(int x, int y, int n, int m) {
        return (x >= 0 && y >= 0 && x < n && y < m);
    }
}
