import java.util.*;

class Solution {
    
    static int[][] dg;
    static int answer;
    static boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        dg = dungeons;
        visited = new boolean[dg.length];
        int p = k;
        dfs(0, p, 0);
        return answer;
    }
    
    public static void dfs(int depth, int p, int count) {
        if (depth==dg.length) {
            answer = Math.max(answer, count);
            return;
        }
        
        for (int i=0; i<dg.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                if (p>=dg[i][0]) {
                    dfs(depth+1, p-dg[i][1], count+1);
                } else dfs(depth+1, p, count);
                visited[i] = false;
            }
        }
        
    }
}