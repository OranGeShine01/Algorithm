import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static List<List<Integer>> graph;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] initialValues = br.readLine().split(" ");
        int n = Integer.parseInt(initialValues[0]);
        int m = Integer.parseInt(initialValues[1]);
        int v = Integer.parseInt(initialValues[2]);
        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[n + 1];
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String[] str = br.readLine().split(" ");
            int startNode = Integer.parseInt(str[0]);
            int endNode = Integer.parseInt(str[1]);
            graph.get(startNode).add(endNode);
            graph.get(endNode).add(startNode);
        }

        for (List<Integer> list : graph) {
            Collections.sort(list);
        }

        dfs(v, visited, sb);
        sb.append('\n');

        visited = new boolean[n + 1];
        bfs(v, visited, sb);

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int node, boolean[] visited, StringBuilder sb) {
        visited[node] = true;
        sb.append(node).append(' ');

        for (int i : graph.get(node)) {
            if (!visited[i]) {
                dfs(i, visited, sb);
            }
        }
    }

    static void bfs(int node, boolean[] visited, StringBuilder sb) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;
        while (!q.isEmpty()) {
            int currentNode = q.poll();
            sb.append(currentNode).append(' ');
            for (int i : graph.get(currentNode)) {
                if (!visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}