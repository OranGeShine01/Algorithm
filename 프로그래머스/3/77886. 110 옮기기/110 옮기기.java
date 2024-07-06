import java.util.*;

class Solution {
    public String[] solution(String[] s) {
        String[] answer = new String[s.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = convertS(s[i]);
        }        
        return answer;
    }
    
    private String convertS(String str) {
        int len = str.length();
        int cnt = 0;
        
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            stack.push(ch);
            if (stack.size() >= 3) {
                char firstCh = stack.pop();
                if (firstCh != '0') {
                    stack.push(firstCh);
                    continue;
                }
                
                char secondCh = stack.pop();
                if (secondCh != '1') {
                    stack.push(secondCh);
                    stack.push(firstCh);
                    continue;
                }
                
                char thirdCh = stack.pop();
                if (thirdCh != '1') {
                    stack.push(thirdCh);
                    stack.push(secondCh);
                    stack.push(firstCh);
                    continue;
                }
                cnt++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        int idx = stack.size();
        boolean flag = false;
        
        while(!stack.isEmpty()){
            char pop = stack.pop();
            if (!flag && pop == '1') idx--;
            if (pop == '0') flag = true;
            sb.append(pop);
        }
        
        String repeated110 = "110".repeat(cnt);
        sb.reverse().insert(idx, repeated110);
    
        return sb.toString();
        
    }
    
    
}