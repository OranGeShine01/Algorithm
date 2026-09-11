import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        int len = progresses.length;
        List<Integer> answer = new ArrayList<>();
        
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            int workDay = (100 - progresses[i]) / speeds[i] + (((100 - progresses[i]) % speeds[i] == 0) ? 0 : 1);
            q.add(workDay);
        }
        
        int releaseDay = q.peek();
        int cnt = 0;
        
        while (!q.isEmpty()) {
            if (releaseDay >= q.peek()) {
                cnt++;
                q.poll();
                if (q.isEmpty()) answer.add(cnt);
            } else {
                answer.add(cnt);
                cnt = 0;
                releaseDay = q.peek();
            }
        }
        
        return answer;
    }
}