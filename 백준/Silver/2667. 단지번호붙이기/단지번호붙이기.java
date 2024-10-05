import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        char[][] map = new char[n][n];
        boolean[][] visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == '1' && !visited[i][j]) {
                    list.add(bfs(new int[]{i, j}, map, visited));
                }
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append('\n');
        for (Integer i : list) {
            sb.append(i).append('\n');
        }
        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }

    static int bfs(int[] start, char[][] map, boolean[][] visited) {
        final int[][] movingPatterns = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int n = map.length;

        Queue<int[]> q = new LinkedList<>();
        q.add(start);
        visited[start[0]][start[1]] = true;

        int count = 1;

        while (!q.isEmpty()) {
            int[] currentNode = q.poll();
            for (int[] movingPattern : movingPatterns) {
                int currentX = currentNode[0] + movingPattern[0];
                int currentY = currentNode[1] + movingPattern[1];

                if (isRange(currentX, currentY, n) && map[currentX][currentY] == '1' && !visited[currentX][currentY]) {
                    q.add(new int[]{currentX, currentY});
                    visited[currentX][currentY] = true;
                    count++;
                }
            }
        }
        return count;
    }

    static boolean isRange(int x, int y, int range) {
        return (x >= 0 && x < range && y >= 0 && y < range);
    }
}