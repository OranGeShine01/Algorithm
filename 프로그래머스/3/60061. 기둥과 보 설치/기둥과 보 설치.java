class Solution {
    
    // 기둥
    boolean[][] col;
    // 보
    boolean[][] row;
    
    public int[][] solution(int n, int[][] build_frame) {
        int[][] answer = {};
        // 기둥
        col = new boolean[n + 2][n + 2];
        // 보
        row = new boolean[n + 2][n + 2];
        int cnt = 0;
        
        for (int[] build : build_frame) {
            int x = build[0];
            int y = build[1];
            int type = build[2];
            int action = build[3];
            
            if (type == 0) {
                if (action == 0) {
                    // 우선 삭제
                    col[x][y] = false;
                    cnt--;
                    // 삭제 불가시 복원
                    if (!checkDel(x, y)) {
                        col[x][y] = true;
                        cnt++;
                    }
                } else {
                    if (checkCol(x, y)) {
                        col[x][y] = true;
                        cnt++;
                    }
                }
            } else {
                if (action == 0) {
                    // 우선 삭제
                    row[x][y] = false;
                    cnt--;
                    // 삭제 불가시 복원
                    if (!checkDel(x, y)) {
                        row[x][y] = true;
                        cnt++;
                    }
                } else {
                    if (checkRow(x, y)) {
                        row[x][y] = true;
                        cnt++;
                    }
                }
            }
        }
        
        answer = new int[cnt][3];
        int idx = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (col[i][j]) answer[idx++] = new int[]{i, j, 0};
                if (row[i][j]) answer[idx++] = new int[]{i, j, 1};
            }
        }
        
        return answer;
    }
    
    // 기둥 설치 가능 여부
    private boolean checkCol(int x, int y) {
        if (y == 0 || col[x][y - 1]) return true;
        if ((x > 0 && row[x - 1][y]) || row[x][y]) return true;
        return false;
    }
    
    // 보 설치 가능 여부    
    private boolean checkRow(int x, int y) {
        if (col[x][y - 1] || col[x + 1][y - 1]) return true;
        if ((x > 0 && row[x - 1][y] && row[x + 1][y])) return true;
        return false;
    }
    
    // 삭제 가능 여부 (공통)
    private boolean checkDel(int x, int y) {
        for (int i = Math.max(x - 1, 0); i <= x + 1; i++) {
            for (int j = y; j <= y + 1; j++) {
                if (col[i][j] && !checkCol(i, j)) return false;
                if (row[i][j] && !checkRow(i, j)) return false;
            }
        }
        return true;
    }
}