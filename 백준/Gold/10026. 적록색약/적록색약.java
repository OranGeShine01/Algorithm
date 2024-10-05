import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static class Node {
        int x;
        int y;
        char value;
        public Node (int x, int y, char value){
            this.x = x;
            this.y = y;
            this.value = value;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        char[][] map = new char[n][n];
        boolean[][][] visited = new boolean[2][n][n];

        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int normalCount = 0;
        int rgCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[0][i][j]) {
                    bfs(map, visited[0], new Node(i, j, map[i][j]), false);
                    normalCount++;
                }
                if (!visited[1][i][j]) {
                    bfs(map, visited[1], new Node(i, j, map[i][j]), true);
                    rgCount++;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(normalCount).append(' ').append(rgCount);
        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }

    static void bfs(char[][] map, boolean[][] visited, Node startNode, boolean isRGSame) {
        final int[][] movingPatterns = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int n = map.length;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{startNode.x, startNode.y});
        visited[startNode.x][startNode.y] = true;

        while (!q.isEmpty()) {
            int[] currentNode = q.poll();
            for (int[] movingPattern : movingPatterns) {
                int currentX = currentNode[0] + movingPattern[0];
                int currentY = currentNode[1] + movingPattern[1];

                if (isRange(currentX, currentY, n) &&
                        (map[currentX][currentY] == startNode.value || (isRGSame && RGCheck(map[currentX][currentY], startNode.value))) &&
                                !visited[currentX][currentY]) {
                    q.add(new int[]{currentX, currentY});
                    visited[currentX][currentY] = true;
                }
            }
        }
    }

    static boolean isRange(int x, int y, int range) {
        return (x >= 0 && x < range && y >= 0 && y < range);
    }

    static boolean RGCheck(char a, char b) {
        return (a == 'R' && b == 'G') || (a == 'G' && b == 'R');
    }
}