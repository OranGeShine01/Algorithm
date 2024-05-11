import java.util.*;

class Solution {
    
    public int solution(int[][] board) {
        
        // constans
        final int dirLen = 4; // 방향 갯수
        final int[][] moving = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};
        final int stCost = 100; // 직선 비용
        final int cnCost = 500; // 코너 비용, 코드상 코너 = 문제상 (코너 + 직선)
        
        int answer = Integer.MAX_VALUE;
        
        int len = board.length;
        int[][][] cost = new int[len][len][dirLen];
        // bfs queue
        Queue<BoardInfo> q = new LinkedList<>();
        
        // cost 배열 초기화
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                for (int k = 0; k < dirLen; k++) {
                    cost[i][j][k] = Integer.MAX_VALUE;
                }
            }
        }
        
        // cost[0][0]은 제외
        for (int i = 0; i < dirLen; i++) {
            cost[0][0][i] = 0;
        }
        
        q.add(new BoardInfo(0, 0, 0));
        
        while (!q.isEmpty()) {
            BoardInfo prev = q.poll();            
            for (int i = 0; i < dirLen; i++) {
                BoardInfo cur = new BoardInfo(prev.row + moving[i][0], prev.col + moving[i][1], i);
                int row = cur.row, col = cur.col, dir = cur.dir;
                cur.cost = cost[prev.row][prev.col][prev.dir];
                if (isRange(len, row, col) && board[row][col] == 0) {
                    cur.cost += stCost;
                    if ((prev.row != 0 || prev.col != 0) && prev.dir != i) cur.cost += cnCost;
                    if (cost[row][col][dir] > cur.cost) {
                        q.add(cur);    
                        cost[row][col][dir] = cur.cost;
                        if (row == len - 1 && col == len - 1 ) {
                            answer = Math.min(answer, cur.cost);
                            continue;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
    
    boolean isRange(int len, int x, int y) {
        return (x >= 0 && x < len && y >= 0 && y < len);
    }
    
    class BoardInfo {
        
        int row;
        int col;
        int dir; // 0 : up, 1 : down, 2 : left, 3 : right
        int cost;
        
        public BoardInfo(int row, int col, int dir) {
            this.row = row;
            this.col = col;
            this.dir = dir;
        }
    }
}