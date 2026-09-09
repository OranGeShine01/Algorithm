import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        int cnt = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        
        for (int i: priorities) {
            pq.add(i);
        }
        
        while(!pq.isEmpty()) {
            int len = pq.size();
            for (int i = 0; i < len; i = (i + 1) % len) {
                if (priorities[i] == pq.peek()) {
                    if (i == location) return answer;
                    pq.poll();
                    answer++;
                }
            }
        }
        
        return answer;
    }
}