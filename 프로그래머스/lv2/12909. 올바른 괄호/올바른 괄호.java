import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        int l = s.length();
        for (int i=0; i<l; i++) {
            char ch = s.charAt(i);
            if (ch=='(') {
                stack.add(ch);
            } else if (stack.empty() && ch==')') {
                return false;
            } else stack.pop();
        }

        if (!stack.empty()) answer=false;
        
        return answer;
    }
}