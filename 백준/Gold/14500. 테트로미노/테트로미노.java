import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static int answer;
    static boolean[][] visited;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        answer = 0;

        int[][] map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(str[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visited[i][j] = true;
                dfs(i, j, map, 0, map[i][j]);
                visited[i][j] = false;
            }
        }


        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int x, int y, int[][] map, int depth, int count) {
        if (depth == 3) {
            answer = Math.max(answer, count);
            return;
        }

        int[][] movingPatterns = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int n = map.length;
        int m = map[0].length;

        for (int[] movingPattern : movingPatterns) {
            int currentX = x + movingPattern[0];
            int currentY = y + movingPattern[1];
            if (isRange(currentX, currentY, n, m) && !visited[currentX][currentY]) {
                visited[currentX][currentY] = true;
                if (depth == 1) {
                    dfs(x, y, map, depth + 1, count + map[currentX][currentY]);
                }
                dfs(currentX, currentY, map, depth + 1, count + map[currentX][currentY]);
                visited[currentX][currentY] = false;
            }
        }

    }

    static boolean isRange(int x, int y, int n, int m) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }
}