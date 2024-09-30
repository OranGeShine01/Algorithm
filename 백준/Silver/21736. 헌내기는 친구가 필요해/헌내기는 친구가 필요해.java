import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int n;
    static int m;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        int x = 0;
        int y = 0;

        char[][] map = new char[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 'I') {
                    x = i;
                    y = j;
                }
            }
        }

        String answer = bfs(map, x, y);

        bw.append(answer);
        bw.flush();
        bw.close();
        br.close();
    }

    static String bfs(char[][] map, int x, int y) {

        final int[][] movingPatterns = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        q.add(new int[]{x, y});
        visited[x][y] = true;
        int count = 0;

        while (!q.isEmpty()) {
            int[] currentPosition = q.poll();
            for (int[] movingPattern : movingPatterns) {
                int currentX = currentPosition[0] + movingPattern[0];
                int currentY = currentPosition[1] + movingPattern[1];
                if (isRange(currentX, currentY) && !visited[currentX][currentY] && map[currentX][currentY] != 'X') {
                    q.add(new int[]{currentX, currentY});
                    visited[currentX][currentY] = true;
                    if (map[currentX][currentY] == 'P') count++;
                }
            }
        }

        return count == 0 ? "TT" : String.valueOf(count);
    }

    static boolean isRange(int x, int y) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }
}
