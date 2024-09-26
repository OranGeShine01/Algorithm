import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws Exception {

        final int defaultNode = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String[] str = br.readLine().split(" ");
            int start = Integer.parseInt(str[0]);
            int end = Integer.parseInt(str[1]);
            graph.get(start).add(end);
            graph.get(end).add(start);
        }

        int ans = bfs(1, graph, n);

        bw.append(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int bfs(int startNode, List<List<Integer>> graph, int n) {
        Queue<Integer> q = new LinkedList<>();
        q.add(startNode);
        int result = 0;
        boolean[] isVisited = new boolean[n + 1];
        while (!q.isEmpty()) {
            int currentNode = q.poll();
            isVisited[currentNode] = true;
            List<Integer> list = graph.get(currentNode);
            for (int i : list) {
                if (!isVisited[i]) {
                    result++;
                    q.add(i);
                    isVisited[i] = true;
                }
            }
        }
        return result;
    }
}
