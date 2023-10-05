import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i : scoville) {
            queue.add(i);
        }
        
        while (queue.size()>=2 && queue.peek()<K) {
            int a = queue.poll();
            int b = queue.poll();
            queue.add(a+2*b);
            
            answer++;
        }
        answer = (queue.peek()<K) ? -1 : answer;
        return answer;
    }
}