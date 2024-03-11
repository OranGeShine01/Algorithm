import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        while (n != 1) {
            if (n%2 == 0) n /= 2;
            else n = 3 * n + 1;
            q.add(n);
        }
        answer = new int[q.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = q.poll();
        }
        return answer;
    }
}