import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int n, m;
    final static int[][] movingPatterns = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    static class NodeInfo {
        int x;
        int y;
        int isCrashed;
        int distance;

        public NodeInfo (int x, int y, int isCrashed, int distance) {
            this.x = x;
            this.y = y;
            this.isCrashed = isCrashed;
            this.distance = distance;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);
        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }



        bw.append(String.valueOf(bfs(map)));
        bw.close();
        br.close();
    }

    static boolean isRange(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    static int bfs(int[][] map) {
        if (n == 1 && m == 1) return 1;
        boolean[][][] isVisited = new boolean[n][m][2];

        Queue<NodeInfo> q = new LinkedList<>();
        q.add(new NodeInfo(0, 0, 0, 1));
        for (int i = 0; i < 2; i++) {
            isVisited[0][0][i] = true;
        }

        while (!q.isEmpty()) {
            NodeInfo currentNode = q.poll();
            for (int[] movingPattern : movingPatterns) {
                int x = currentNode.x + movingPattern[0];
                int y = currentNode.y + movingPattern[1];
                int isCrashed = currentNode.isCrashed;
                int distance = currentNode.distance;

                if (x == n - 1 && y == m - 1) {
                    return distance + 1;
                }

                if (isRange(x, y) && !isVisited[x][y][isCrashed]) {
                    if (map[x][y] == 0) {
                        isVisited[x][y][isCrashed] = true;
                        q.add(new NodeInfo(x, y, isCrashed, distance + 1));
                    } else if (isCrashed == 0) {
                        isVisited[x][y][1] = true;
                        q.add(new NodeInfo(x, y, 1, distance + 1));
                    }
                }
            }
        }

        return -1;
    }
}