import java.util.*;

class Solution {
    
    int answer;
    List<Edge>[] graph;
    
    class Edge {
        int next;
        int type;
        
        public Edge(int next, int type) {
            this.next = next;
            this.type = type;
        }
    }
    
    public int solution(int n, int infection, int[][] edges, int k) {
        answer = 0;
        
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();    
        }
        for (int[] edge : edges) {
            int type = edge[2];
            
            graph[edge[0]].add(new Edge(edge[1], type));
            graph[edge[1]].add(new Edge(edge[0], type));
        }
        
        boolean[] visited = new boolean[n + 1];
        visited[infection] = true;
        dfs(visited, 0, k, 0);
        
        return answer;
    }   
    
        boolean[] bfs(List<Edge>[] graph, boolean[] visited, int type) {
            Queue<Integer> q = new LinkedList<>();
            int n = graph.length - 1;
            for (int i = 1; i <= n; i++) {
                if (visited[i]) q.add(i);
            }
            
            while (!q.isEmpty()) {
                int curr = q.poll();
                for (Edge e : graph[curr]) {
                    if (e.type == type && !visited[e.next]) {
                        visited[e.next] = true;
                        q.add(e.next);
                    }
                }
            }
            return visited;
        }
        
        void dfs(boolean[] visited, int depth, int k, int prevType) {
            int value = 0;
            if (depth == k) {
                for (boolean b : visited) {
                    if (b) value++;
                }
                answer = Math.max(value, answer);
                return;
            }
            
            for (int i = 1; i <= 3; i++) {
                if (prevType == i) continue;
                boolean[] nextVisited = visited.clone();
                nextVisited = bfs(graph, nextVisited, i);
                dfs(nextVisited, depth + 1, k, i);
            }
        }    
}