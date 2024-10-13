import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static boolean[] visited;
    static int[] counts;
    static int count;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nmr = br.readLine().split(" ");
        int n = Integer.parseInt(nmr[0]);
        int m = Integer.parseInt(nmr[1]);
        int r = Integer.parseInt(nmr[2]);

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String[] str = br.readLine().split(" ");
            int u = Integer.parseInt(str[0]);
            int v = Integer.parseInt(str[1]);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        StringBuilder sb = new StringBuilder();
        visited = new boolean[n + 1];
        counts = new int[n + 1];
        count = 1;

        dfs(r, graph);
        for (int i = 1; i <= n; i++) {
            sb.append(counts[i]).append('\n');
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int r, List<List<Integer>> graph) {
        visited[r] = true;
        counts[r] = count++;

        for (int i : graph.get(r)) {
            if (!visited[i]) {
                dfs(i, graph);
            }
        }
    }
}