import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        Queue<String> q = new LinkedList<>();
        
        for (String s : strArr) {
            if (!s.contains("ad")) q.add(s);
        }
        
        answer = new String[q.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = q.poll();
        }
        return answer;
    }
}