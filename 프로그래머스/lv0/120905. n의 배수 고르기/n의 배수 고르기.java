import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();
        for (int i : numlist) {
            if (i%n==0) {
                queue.add(i);
            }
        }
        
        answer = new int[queue.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = queue.poll();
        }
        
        return answer;
    }
}