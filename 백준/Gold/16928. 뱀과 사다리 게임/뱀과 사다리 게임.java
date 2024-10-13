import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static class NodeInfo {
        int x;
        int diceCount;
        public NodeInfo(int x, int diceCount) {
            this.x = x;
            this.diceCount = diceCount;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] ladderAndSnakes = new int[100 + 1];

        for (int i = 0; i < n + m; i++) {
            String[] str = br.readLine().split(" ");
            int index = Integer.parseInt(str[0]);
            int value = Integer.parseInt(str[1]);
            ladderAndSnakes[index] = value;
        }

        bw.append(String.valueOf(bfs(ladderAndSnakes)));
        bw.flush();
        bw.close();
        br.close();
    }

    static int bfs(int[] ladderAndSnakes) {

        Queue<NodeInfo> q = new LinkedList<>();
        q.add(new NodeInfo(1, 0));
        boolean[] visited = new boolean[100 + 1];

        while (!q.isEmpty()) {
            NodeInfo currentNode = q.poll();
            for (int i = 1; i <= 6; i++) {
                int nextX = currentNode.x + i;
                if (!visited[nextX]) {
                    visited[nextX] = true;
                    if (ladderAndSnakes[nextX] != 0) {
                        nextX = ladderAndSnakes[nextX];
                        visited[nextX] = true;
                    }
                    int nextCount = currentNode.diceCount + 1;
                    if (nextX == 100) return nextCount;
                    q.add(new NodeInfo(nextX, nextCount));
                }
            }
        }

        return -1;
    }
}