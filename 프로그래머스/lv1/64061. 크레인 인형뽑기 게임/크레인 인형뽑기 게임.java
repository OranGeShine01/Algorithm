import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int r = board.length; // board의 row
        int c = board[0].length; // board의 column
        Stack<Integer>[] stacks = new Stack[c]; // board의 상태를 저장할 stack array

        //stacks 초기화
        for (int i=0; i<c; i++) {
            stacks[i] = new Stack<>();
            for (int j=r-1; j>=0; j--) {
                if (board[j][i]!=0) {
                    stacks[i].add(board[j][i]);
                }
            }
        }

        Stack<Integer> stack = new Stack<>(); // 바구니
        int count = 0; // 터트린 인형수
        for (int i=0; i<moves.length; i++) {
            if (!stacks[moves[i]-1].empty()) {
                int temp = stacks[moves[i]-1].pop();
                if (!stack.empty() && temp==stack.peek()) {
                    stack.pop();
                    count+=2;
                }
                else {
                    stack.add(temp);
                }
            }
        }

        return count;
    }
}