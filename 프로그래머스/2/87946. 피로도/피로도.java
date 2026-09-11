import java.util.*;

class Solution {
    
    int answer;
    int len = 0;
    boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        answer = 0;
        len = dungeons.length;
        visited = new boolean[len];
        dfs(k, dungeons, 0);
        return answer;
    }
    
    void dfs(int k, int[][] dungeons, int depth) {
        if (depth == len) {
            answer = Math.max(answer, depth);
            return;
        }
        for (int i = 0; i < len; i++) {
            if (visited[i] || k < dungeons[i][0]) continue;
            visited[i] = true;
            dfs(k - dungeons[i][1], dungeons, depth + 1);
            visited[i] = false;
        }
        answer = Math.max(answer, depth);
    }
}