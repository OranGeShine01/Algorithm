import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> st = new Stack<>();
        
        char[] arr = s.toCharArray();
        
        for (char ch : arr) {
            if (ch == '(') {
                st.add(ch);
            } else if (st.isEmpty()) {
                answer = false;
                break;
            } else {
                st.pop();
            }
        }
        
        return (st.isEmpty()) ? answer : false;
    }
}