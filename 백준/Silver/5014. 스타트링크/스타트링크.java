import java.io.*;
import java.util.*;

public class Main {

    static class NodeInfo {
        int floor;
        int count;

        public NodeInfo(int floor, int count) {
            this.floor = floor;
            this.count = count;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");


        int f = Integer.parseInt(str[0]);
        int s = Integer.parseInt(str[1]);
        int g = Integer.parseInt(str[2]);
        int u = Integer.parseInt(str[3]);
        int d = Integer.parseInt(str[4]);

        boolean[] isVisited = new boolean[f + 1];

        int answer = bfs(isVisited, s, u, d, g);

        br.close();
        bw.append(String.valueOf(answer == -1 ? "use the stairs" : answer));
        bw.flush();
        bw.close();
    }

    static int bfs(boolean[] isVisited, int s, int u, int d, int g) {

        int f = isVisited.length - 1;
        Queue<NodeInfo> q = new LinkedList<>();
        isVisited[s] = true;
        q.add(new NodeInfo(s, 0));

        while(!q.isEmpty()) {
            NodeInfo currentNode = q.poll();
            if (currentNode.floor == g) return currentNode.count;
            int[] nextFloorList = { currentNode.floor + u, currentNode.floor - d };
            for (int i : nextFloorList) {

                if (isRange(i,f) && !isVisited[i]) {
                    q.add(new NodeInfo(i, currentNode.count + 1));
                    isVisited[i] = true;
                }
            }
        }

        return -1;
    }

    static boolean isRange(int floor, int f) {
        return (floor >= 1 && floor <= f);
    }
}