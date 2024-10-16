import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<List<Integer>> graph = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            String[] uv = br.readLine().split(" ");
            int u = Integer.parseInt(uv[0]);
            int v = Integer.parseInt(uv[1]);

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int[] parent = bfs(n, 1, graph);
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            sb.append(parent[i]).append('\n');
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }

    static int[] bfs(int n, int root, List<List<Integer>> graph) {
        int[] result = new int[n + 1];
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        q.add(root);
        visited[root] = true;

        while(!q.isEmpty()) {
            int currentNode = q.poll();
            for (int i : graph.get(currentNode)) {
                if (!visited[i]) {
                    q.add(i);
                    result[i] = currentNode;
                    visited[i] = true;
                }
            }
        }
        return result;
    }

}