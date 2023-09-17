import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int l = s.length();
        for (int i=0; i<l; i++) {
            Stack<Character> stack = new Stack<>();
            boolean b = true;
            for (int j=i; j<i+l; j++) {
                char ch = s.charAt(j%l);
                if (ch=='[' || ch=='(' || ch=='{') {
                    stack.push(ch);
                } else if (stack.isEmpty()) {
                    b = false;
                    break;
                }
                else if ((ch==']' && stack.peek()=='[') || 
                         (ch==')' && stack.peek()=='(') || 
                         (ch=='}' && stack.peek()=='{')) {
                    stack.pop();
                } else {
                    b = false;
                    break;
                }
            }
            if (b && stack.isEmpty()) answer++;
        }
        
        return answer;
    }
}