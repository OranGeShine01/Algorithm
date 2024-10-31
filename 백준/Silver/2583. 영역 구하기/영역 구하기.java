import java.io.*;
import java.util.*;

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

        String[] nmk = br.readLine().split(" ");


        int m = Integer.parseInt(nmk[0]);
        int n = Integer.parseInt(nmk[1]);
        int k = Integer.parseInt(nmk[2]);

        boolean[][] map = new boolean[m][n];

        while (k > 0) {
            String[] str = br.readLine().split(" ");
            int startX = Integer.parseInt(str[0]);
            int startY = Integer.parseInt(str[1]);
            int endX = Integer.parseInt(str[2]);
            int endY = Integer.parseInt(str[3]);

            for (int i = startY; i < endY; i++) {
                for (int j = startX; j < endX; j++) {
                    map[i][j] = true;
                }
            }

            k--;
        }


        StringBuilder answer = new StringBuilder();

        List<Integer> list = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!map[i][j]) {
                    count++;
                   list.add(bfs(map, i, j));
                }
            }
        }

        answer.append(count).append('\n');
        Collections.sort(list);
        for (int i : list) {
            answer.append(i).append(' ');
        }

        br.close();
        bw.append(answer);
        bw.flush();
        bw.close();
    }

    static int bfs(boolean[][] map, int startX, int startY) {

        final int[][] movingPatterns = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int m = map.length;
        int n = map[0].length;
        Queue<NodeInfo> q = new LinkedList<>();
        int result = 1;
        map[startX][startY] = true;

        q.add(new NodeInfo(startX, startY));

        while(!q.isEmpty()) {
            NodeInfo currentNode = q.poll();
            for (int[] movingPattern : movingPatterns) {
                int x = currentNode.x + movingPattern[0];
                int y = currentNode.y + movingPattern[1];

                if (isRange(x, y, m, n) && !map[x][y]) {
                    map[x][y] = true;
                    result++;
                    q.add(new NodeInfo(x, y));
                }
            }
        }

        return result;
    }

    static boolean isRange(int x, int y, int m, int n) {
        return (x >= 0 && x < m && y >= 0 && y < n);
    }
}