class Solution {
    public int solution(int[][] board, int[][] skill) {
        int answer = 0;
        int n = board.length;
        int m = board[0].length;
        // prefix sum
        int[][] ps = new int[n + 1][m + 1];
        
        for (int[] arr : skill) {
            int type = arr[0];
            int r1 = arr[1];
            int c1 = arr[2];
            int r2 = arr[3];
            int c2 = arr[4];
            int degree = arr[5];
            
            degree *= (type == 1) ? -1 : 1;
            
            ps[r1][c1] += degree;
            ps[r2 + 1][c1] -= degree;
            ps[r1][c2 + 1] -= degree;
            ps[r2 + 1][c2 + 1] += degree;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                ps[i][j] += ps[i][j - 1];
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                ps[j][i] += ps[j - 1][i];
            }
        } 
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] + ps[i][j] > 0) answer++;
            }
        }
        
        return answer;
    }
}