class Solution {
    public int solution(int[][] board) {
        int l = board.length;
        int answer = 0;
        boolean[][] arr = new boolean[l+2][l+2];
        for (int i=1; i<=l; i++) {
            for (int j=1; j<=l; j++) {
                if (board[i-1][j-1]==1) {
                    for (int m=-1; m<=1; m++) {
                        for (int n=-1; n<=1; n++) {
                            arr[i+m][j+n]=true;
                        }
                    }
                }
            }
        }

        for (int i=1; i<=l; i++) {
            for (int j=1; j<=l; j++) {
                if (!arr[i][j]) {
                    answer++;
                }
            }
        }

        return answer;
    }
}