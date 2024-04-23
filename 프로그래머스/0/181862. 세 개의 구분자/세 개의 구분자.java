import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] str = myStr.split("[abc]");
        Queue<String> q = new LinkedList<>();
        for (String s: str) {
            if (!s.isEmpty()) q.add(s);
        }
        if (q.isEmpty()) return new String[]{"EMPTY"};
        String[] answer = new String[q.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = q.poll();
        }
        return answer;
    }
}