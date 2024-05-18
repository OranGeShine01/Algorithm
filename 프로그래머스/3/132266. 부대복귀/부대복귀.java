import java.util.*;

class Solution {
    
    // 각 인접노드 저장할 그래프
    ArrayList<Integer>[] graph;
    // 목표까지 도달하는데 드는 비용배열
    int[] cost;
    
    public int[] solution(int n, int[][] roads, int[] sources, int destination) {
        int[] answer = new int[sources.length];
        graph = new ArrayList[n + 1];
        cost = new int[n + 1];
        
        
        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        
        // 간선추가
        for (int[] road : roads) {
            graph[road[0]].add(road[1]);   
            graph[road[1]].add(road[0]);
        }
        
        Arrays.fill(cost, -1);
        bfs(destination);
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = cost[sources[i]];
        }
        
        return answer;
    }
    
    private void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        cost[start] = 0;
        
        while (!q.isEmpty()) {
            int cur = q.poll();
            for (Integer i : graph[cur]) {
                if (cost[i] == -1) {
                    cost[i] = cost[cur] + 1;
                    q.add(i);
                }
            }            
        }
    }
    
    
}