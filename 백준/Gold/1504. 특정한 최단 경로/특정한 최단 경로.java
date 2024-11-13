import java.io.*;
import java.util.*;

public class Main {

    static final int INF = 200000000;

    static class Node implements Comparable<Node> {
        int vertex;
        int weight;

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node node) {
            return weight - node.weight;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ne = br.readLine().split(" ");
        int n = Integer.parseInt(ne[0]);
        int e = Integer.parseInt(ne[1]);

        List<List<Node>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            int c = Integer.parseInt(inputs[2]);
            graph.get(a).add(new Node(b, c));
            graph.get(b).add(new Node(a, c));
        }

        String[] v = br.readLine().split(" ");
        int v1 = Integer.parseInt(v[0]);
        int v2 = Integer.parseInt(v[1]);

        int answer1 = 0;
        answer1 += dijkstra(graph, 1, v1);
        answer1 += dijkstra(graph, v1, v2);
        answer1 += dijkstra(graph, v2, n);

        int answer2 = 0;
        answer2 += dijkstra(graph, 1, v2);
        answer2 += dijkstra(graph, v2, v1);
        answer2 += dijkstra(graph, v1, n);
        int answer = (answer1 >= INF && answer2 >= INF) ? -1 : Math.min(answer1, answer2);

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    static int dijkstra(List<List<Node>> graph, int start, int end) {
        int n = graph.size() - 1;
        int[] distance = new int[n + 1];
        Arrays.fill(distance, INF);
        PriorityQueue<Node> pq = new PriorityQueue<>();
        boolean[] isVisited = new boolean[n + 1];
        pq.add(new Node(start, 0));
        distance[start] = 0;

        while (!pq.isEmpty()) {
            Node currentNode = pq.poll();
            int currentVertex = currentNode.vertex;

            if (!isVisited[currentVertex]) {
                isVisited[currentVertex] = true;
                for (Node node : graph.get(currentVertex)) {
                    int nextVertex = node.vertex;
                    if (!isVisited[nextVertex] && distance[currentVertex] + node.weight < distance[nextVertex]) {
                        distance[nextVertex] = distance[currentVertex] + node.weight;
                        pq.add(new Node(nextVertex, distance[nextVertex]));
                    }
                }
            }
        }
        return distance[end];
    }
}
