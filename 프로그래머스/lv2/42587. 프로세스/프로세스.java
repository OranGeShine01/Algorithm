import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i : priorities) {
            queue.add(i);
        }
        
        int answer = 1;
        int count = 0;
        while(!queue.isEmpty()) {
            int l = priorities.length;
            for (int i=count; i<count+l; i=(i+1)%l) {
                if (priorities[i]==queue.peek()) {
                    if (i==location) return answer;
                    queue.poll();
                    count = i;
                    answer++;
                }
            }
        }
        return answer;
    }
}