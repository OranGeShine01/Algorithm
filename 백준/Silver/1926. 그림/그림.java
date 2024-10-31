import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static class NodeInfo {
        int x;
        int y;

        public NodeInfo(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");


        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        boolean[][] map = new boolean[n][m];
        boolean[][] isVisited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                map[i][j] = str[j].equals("1");
            }
        }

        StringBuilder answer = new StringBuilder();
        int count = 0;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!isVisited[i][j] && map[i][j]) {
                   count++;
                   maxArea = Math.max(maxArea, bfs(map, isVisited, i, j));
                }
            }
        }
        answer.append(count).append('\n').append(maxArea);

        br.close();
        bw.append(answer);
        bw.flush();
        bw.close();
    }

    static int bfs(boolean[][] map, boolean[][] isVisited, int startX, int startY) {

        final int[][] movingPatterns = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int n = map.length;
        int m = map[0].length;
        Queue<NodeInfo> q = new LinkedList<>();
        int result = 1;
        isVisited[startX][startY] = true;

        q.add(new NodeInfo(startX, startY));

        while(!q.isEmpty()) {
            NodeInfo currentNode = q.poll();
            for (int[] movingPattern : movingPatterns) {
                int x = currentNode.x + movingPattern[0];
                int y = currentNode.y + movingPattern[1];

                if (isRange(x, y, n, m) && !isVisited[x][y] && map[x][y]) {
                    isVisited[x][y] = true;
                    result++;
                    q.add(new NodeInfo(x, y));
                }
            }
        }

        return result;
    }

    static boolean isRange(int x, int y, int n, int m) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }
}