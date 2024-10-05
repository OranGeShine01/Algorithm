import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static class Node {
        int x;
        int y;
        int distance;
        public Node (int x, int y, int distance){
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        char[][] map = new char[n][m];
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int normalCount = 0;
        int rgCount = 0;

        int answer = bfs(map, visited, new Node(0, 0, 1));

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    static int bfs(char[][] map, boolean[][] visited, Node startNode) {
        final int[][] movingPatterns = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int n = map.length;
        int m = map[0].length;

        Queue<Node> q = new LinkedList<>();
        q.add(startNode);
        visited[startNode.x][startNode.y] = true;

        while (!q.isEmpty()) {
            Node currentNode = q.poll();
            for (int[] movingPattern : movingPatterns) {
                int currentX = currentNode.x + movingPattern[0];
                int currentY = currentNode.y + movingPattern[1];

                if (currentX == n - 1 && currentY == m - 1) return currentNode.distance + 1;

                if (isRange(currentX, currentY, n, m) && map[currentX][currentY] == '1' && !visited[currentX][currentY]) {
                    q.add(new Node(currentX, currentY, currentNode.distance + 1));
                    visited[currentX][currentY] = true;
                }
            }
        }
        return -1;
    }

    static boolean isRange(int x, int y, int n, int m) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }

    static boolean RGCheck(char a, char b) {
        return (a == 'R' && b == 'G') || (a == 'G' && b == 'R');
    }
}