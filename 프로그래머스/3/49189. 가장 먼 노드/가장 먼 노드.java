import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        
        for (int[] arr : edge) {
            int edge1 = arr[0] - 1;
            int edge2 = arr[1] - 1;
            graph.get(edge1).add(edge2);
            graph.get(edge2).add(edge1);
        }
        
        return bfs(0, graph);
    }
    
    int bfs(int start, ArrayList<ArrayList<Integer>> graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];
        int[] distance = new int[graph.size()];
        int max = 0;
        int cnt = 0;
        
        q.add(start);
        visited[start] = true;
        
        while (!q.isEmpty()) {
            int curNode = q.poll();
            for (Integer i : graph.get(curNode)) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                    distance[i] = distance[curNode] + 1;
                    max = Math.max(max, distance[i]);
                }
            }
        }
        
        for (int i : distance) {
            if (i == max) cnt++;
        }
        
        return cnt;
    }
}