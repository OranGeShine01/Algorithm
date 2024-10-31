import java.io.*;
import java.util.*;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] map = new int[n][n];
        int maxHeight = 0;

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(str[j]);
                maxHeight = Math.max(maxHeight, map[i][j]);
            }
        }

        int answer = 1;

        for (int k = 0; k <= maxHeight; k++) {
            boolean[][] isVisited = new boolean[n][n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!isVisited[i][j] && map[i][j] > k) {
                        count++;
                        bfs(map, isVisited, i, j, k);
                    }
                }
            }
            answer = Math.max(answer, count);
        }

        br.close();
        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

    static void bfs(int[][] map, boolean[][] isVisited, int startX, int startY, int rainHeight) {

        int[][] movingPatterns = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};

        int n = isVisited.length;
        Queue<int[]> q = new LinkedList<>();
        isVisited[startX][startY] = true;
        q.add(new int[]{startX, startY});

        while(!q.isEmpty()) {
            int[] currentNode = q.poll();
            for (int[] movingPattern : movingPatterns) {
                int x = currentNode[0] + movingPattern[0];
                int y = currentNode[1] + movingPattern[1];
                if (isRange(x, y, n) && !isVisited[x][y] && map[x][y] > rainHeight) {
                    isVisited[x][y] = true;
                    q.add(new int[]{x, y});
                }
            }

        }
    }

    static boolean isRange(int x, int y, int n) {
        return (x >= 0 && y >= 0 && x < n && y < n);
    }
}