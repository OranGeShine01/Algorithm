import java.util.*;

class Solution {
    
    int row;
    int col;
    final int[][] move = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    
    public int solution(String[] board) {
        int answer = -1;
        
        row = board.length;
        col = board[0].length();
        int[] r = {};
        
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (board[i].charAt(j)=='R') {
                    r = new int[]{i, j, 0};
                    break;
                }
            }
        }
        
        answer = bfs(r, board);
        
        return answer;
    }
    
    int bfs (int[] robot, String[] board) {
        Queue<int[]> q = new LinkedList<>();
        q.add(robot);
        boolean[][] v = new boolean[row][col];
        v[robot[0]][robot[1]] = true;
        int cnt = 0;
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            if (board[cur[0]].charAt(cur[1])=='G') return cur[2];
            for (int[] arr : move) {
                int x = cur[0];
                int y = cur[1];
                while (x>=0 && x<row && y>=0 && y<col && board[x].charAt(y)!='D') {
                    x+=arr[0];
                    y+=arr[1];
                }
                x-=arr[0];
                y-=arr[1];
                if (!v[x][y] && (x!=cur[0] || y!=cur[1])) {
                    q.add(new int[]{x, y, cur[2]+1});
                    v[x][y] = true;
                }                
            }
        }
        
        return -1;
    }
}