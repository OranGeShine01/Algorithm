import java.util.*;

class Solution {
    public int solution(int n, int[][] costs) {
        int answer = 0;
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        Arrays.sort(costs, ((o1, o2) -> (o1[2] - o2[2])));
        
        for (int[] cost : costs) {
            if (find(parent, cost[0]) != find(parent, cost[1])) {
                union(parent, cost[0], cost[1]);
                answer += cost[2];
            }
        }
        
        return answer;
    }
    
    int find(int[] parent, int n) {
        if (parent[n] == n) return n;
        return find(parent, parent[n]);
    }
    
    void union(int[] parent, int x, int y) {
        int rootX = find(parent, x);
        int rootY = find(parent, y);
        
        if (rootX < rootY) parent[rootY] = rootX;
        else parent[rootX] = rootY;
    }
}