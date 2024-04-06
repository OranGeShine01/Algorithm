class Solution {
    
    class Count {
        int o;
        int x;
        Count (int o, int x) {
            this.o = o;
            this.x = x;
        }
    }
    
    public int solution(String[] board) {
        Count cnt = counting(board);
        
        if (cnt.o > cnt.x + 1) return 0;
        if (cnt.x > cnt.o) return 0;
        if (hasWin(board, 'O') && cnt.o != cnt.x + 1) return 0;
        if (hasWin(board, 'X') && cnt.x != cnt.o) return 0;
        return 1;
    }
    
    boolean hasWin(String[] board, char ch) {
        int len = board[0].length();
        
        // 가로 검사
        for (String s: board) {
            boolean horizontal = true;
            for (int i=0; i<len; i++) {
                if (s.charAt(i) != ch) {
                    horizontal = false;
                    break;
                }
            }
            if (horizontal) return true;
        }
        
        // 세로 검사
        for (int i=0; i<len; i++) {
            boolean vertical = true;
            for (String s: board) {
                if (s.charAt(i) != ch) {
                    vertical = false;
                    break;
                }
            }
            if (vertical) return true;
        }
        
        // 대각선 검사 (\ 모양)
        boolean cross = true;
        for (int i=0; i<board.length; i++) {
            if (board[i].charAt(i) != ch) {
                cross = false;
                break;
            }
        }
        
        if (cross) return true;
        cross = true;
        
        // 대각선 검사 (/모양)
        for (int i=0; i<board.length; i++) {
            if (board[board.length-1-i].charAt(i) != ch) {
                cross = false;
                break;
            }
        }
        return cross;
    }
    
    Count counting(String[] board) {
        int len = board[0].length();
        Count cnt = new Count(0, 0);
        
        for (String s: board) {
            for (int i=0; i<len; i++) {
                char ch = s.charAt(i);
                if (ch == 'O') cnt.o++;
                else if (ch == 'X') cnt.x++;
            }
        }
        return cnt;
    }
}