import java.util.*;

class Solution {
    
    int[][] arr;
    
    public int solution(int n, int[][] wires) {
        int answer = n;
        arr = new int[n+1][n+1];
        
        for (int i=0; i<wires.length; i++) {
            arr[wires[i][0]][wires[i][1]] = 1;
            arr[wires[i][1]][wires[i][0]] = 1;
        }
        
        for (int i=0; i<wires.length; i++) {
            
            int left = wires[i][0];
            int right = wires[i][1];
            
            arr[left][right] = 0;
            arr[right][left] = 0;
            
            answer = Math.min(answer, bfs(left, n));
            
            arr[left][right] = 1;
            arr[right][left] = 1;
        }
        
        return answer;
    }
    
    int bfs(int left, int n) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n+1];
        int count = 1;
        
        q.add(left);
        visited[left] = true;
        
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int i=1; i<n+1; i++) {
                if (arr[node][i]==1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                    count++;
                }
            }
        }
        
        return Math.abs(count*2-n);
    }
    
    
}