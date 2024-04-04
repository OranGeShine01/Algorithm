import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        Queue<Integer> q = new LinkedList<>();
        
        for (String str: intStrs) {
            int n = Integer.parseInt(str.substring(s, s+l));
            if (k < n) {
                q.add(n);
            }
        }
        
        answer = new int[q.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = q.poll();
        }
        
        return answer;
    }
}