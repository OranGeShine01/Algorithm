import java.util.*;

class Solution {
    public String[] solution(String myString) {
        StringTokenizer st = new StringTokenizer(myString, "x+");
        Queue<String> q = new LinkedList<>();
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            if (!str.equals("")) q.add(str);
        }
        String[] answer = new String[q.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = q.poll();
        }
        Arrays.sort(answer);
        return answer;
    }
}