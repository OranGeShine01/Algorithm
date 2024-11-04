import java.io.*;
import java.util.*;

public class Main {

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

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        List<List<Node>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String[] str = br.readLine().split(" ");
            int u = Integer.parseInt(str[0]);
            int v = Integer.parseInt(str[1]);
            int cost = Integer.parseInt(str[2]);
            graph.get(u).add(new Node(v, cost));
        }

        String[] str = br.readLine().split(" ");
        int start = Integer.parseInt(str[0]);
        int end = Integer.parseInt(str[1]);

        int answer = dijkstra(graph, start, end);

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    static int dijkstra(List<List<Node>> graph, int start, int end) {

        final int INF = 100000001;

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

        return result[end];
    }
}
