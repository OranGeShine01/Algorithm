class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int r = board.length; int c = board[0].length;
        
        int[][] move = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        for (int[] arr : move) {
            int x = h+arr[0];
            int y = w+arr[1];
            if (x>=0 && x<r && y>=0 && y<c && board[h][w].equals(board[x][y])) answer++;
        }
        return answer;
    }
}