import java.util.*;

class Solution {
    
    int row;
    int col;
    int[] oil;
    
    public int solution(int[][] land) {
        int answer = 0;
        row = land.length;
        col = land[0].length;
        oil = new int[col];
        boolean visited[][] = new boolean[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (land[i][j] == 1 && !visited[i][j]) {
                    bfs(land, visited, i, j);   
                }
            }
        }
        
        for (int i : oil) {
            answer = Math.max(answer, i);
        }
        
        return answer;
    }
    
    void bfs(int[][] land, boolean[][] visited, int i, int j) {
        
        int[][] moving = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int len = moving.length;
        
        Queue<int[]> q = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        int cnt = 1;
        q.add(new int[]{i, j});
        visited[i][j] = true;
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            set.add(cur[1]);
            for (int k = 0; k < len; k++) {
                int x = cur[0] + moving[k][0];
                int y = cur[1] + moving[k][1];
                if (isRange(x, y) && land[x][y] == 1 && !visited[x][y]) {
                    q.add(new int[]{x, y});
                    cnt++;
                    visited[x][y] = true;
                }
            }
        }
        
        for (int s : set ) {
            oil[s] += cnt;
        }
        
    }
    
    boolean isRange(int x, int y) {
        return (x >= 0 && y >= 0 && x < row && y < col);
    }
}