import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i=k; i<=n; i+=k) {
            queue.add(i);
        }
        
        int[] answer = new int[queue.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = queue.poll();
        }
        return answer;
    }
}