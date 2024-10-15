import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static class NodeInfo {
        int x;
        int y;
        int count;

        public NodeInfo(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int l = Integer.parseInt(br.readLine());
            String[] start = br.readLine().split(" ");
            String[] end = br.readLine().split(" ");
            int startX = Integer.parseInt(start[0]);
            int startY = Integer.parseInt(start[1]);
            int endX = Integer.parseInt(end[0]);
            int endY = Integer.parseInt(end[1]);
            int result = startX == endX && startY == endY ? 0 : bfs(l, startX, startY, endX, endY);
            sb.append(result).append('\n');
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }

    static int bfs(int l, int startX, int startY, int endX, int endY) {
        final int[][] movingPatterns = {{-2, 1}, {-2, -1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};
        boolean[][] visited = new boolean[l][l];
        Queue<NodeInfo> q = new LinkedList<>();
        int result = Integer.MAX_VALUE;
        visited[startX][startY] = true;
        q.add(new NodeInfo(startX, startY, 0));

        while (!q.isEmpty()) {
            NodeInfo currentNode = q.poll();
            for (int[] movingPattern : movingPatterns) {
                int currentX = currentNode.x + movingPattern[0];
                int currentY = currentNode.y + movingPattern[1];
                if (isRange(currentX, currentY, l) && !visited[currentX][currentY]) {
                    visited[currentX][currentY] = true;
                    int currentCount = currentNode.count + 1;
                    if (currentX == endX && currentY == endY) {
                        return currentCount;
                    }
                    q.add(new NodeInfo(currentX, currentY, currentCount));

                }
            }

        }
        return result;
    }

    static boolean isRange(int x, int y, int l) {
        return x >= 0 && y >= 0 && x < l && y < l;
    }
}