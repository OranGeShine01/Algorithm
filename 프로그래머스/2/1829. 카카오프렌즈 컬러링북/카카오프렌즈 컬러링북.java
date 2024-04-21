import java.util.*;

class Solution {
    
    int area;
    int max;
    
    public int[] solution(int m, int n, int[][] picture) {
        int area = 0;
        max = 0;
        boolean[][] visited = new boolean[m][n];

        int[] answer = new int[2];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] != 0 && !visited[i][j]) {
                    bfs(i, j, visited, m, n, picture);
                    area++;
                }
            }
        }
        
        answer[0] = area;
        answer[1] = max;
        return answer;
    }
    
    void bfs(int x, int y, boolean[][] visited, int m, int n, int[][] picture) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;
        int color = picture[x][y];
        int cnt = 1;
        
        while(!q.isEmpty()) {
            
            int[] dx = {0, 1, 0, -1};
            int[] dy = {1, 0, -1, 0};
            int[] cur = q.poll();
            
            for (int i = 0; i < 4; i++) {
                int curX = cur[0] + dx[i];
                int curY = cur[1] + dy[i];
                if (isRange(curX, curY, m, n) && 
                    !visited[curX][curY] && 
                    color == picture[curX][curY]) {
                    cnt++;
                    visited[curX][curY] = true;
                    q.add(new int[]{curX, curY});
                }                
            }
        }
        
        max = Math.max(max, cnt);
        
    }
    
    boolean isRange(int x, int y, int m, int n) {
        return (x >= 0 && x < m && y >= 0 && y < n);
    }
}