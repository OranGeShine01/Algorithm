import java.io.*;
import java.util.*;

public class Main {

    final static int INF = 100000001;

    static class Node {
        int vertex;
        int cost;

        public Node(int vertex, int cost) {
            this.vertex = vertex;
            this.cost = cost;
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ve = br.readLine().split(" ");
        int n = Integer.parseInt(ve[0]);
        int e = Integer.parseInt(ve[1]);
        int start = Integer.parseInt(br.readLine());

        List<List<Node>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            String[] str = br.readLine().split(" ");
            int u = Integer.parseInt(str[0]);
            int v = Integer.parseInt(str[1]);
            int cost = Integer.parseInt(str[2]);
            graph.get(u).add(new Node(v, cost));
        }

        int[] dist = dijkstra(graph, start);

        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= n; i++) {
//            if (i != INF) answer.append(i);
//            else answer.append("INF");
            answer.append((dist[i] != INF) ? dist[i] : "INF");
            answer.append('\n');
        }

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    static int[] dijkstra(List<List<Node>> graph, int start) {

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));
        int[] result = new int[graph.size()];
        Arrays.fill(result, INF);
        pq.add(new Node(start, 0));
        result[start] = 0;

        while(!pq.isEmpty()) {
            Node currentNode = pq.poll();

            if (currentNode.cost > result[currentNode.vertex]) continue;

            for (Node node : graph.get(currentNode.vertex)) {

                if (result[currentNode.vertex] + node.cost < result[node.vertex]) {
                    result[node.vertex] = result[currentNode.vertex] + node.cost;
                    pq.add(new Node(node.vertex, result[node.vertex]));
                }
            }
        }

        return result;
    }
}
