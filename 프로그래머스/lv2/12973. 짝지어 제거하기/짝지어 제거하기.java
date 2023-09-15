import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (stack.empty()) stack.push(ch);
            else {
                if (stack.peek()==ch) stack.pop();
                else stack.push(ch);
            }
        }
        if (stack.size()==0) answer=1;

        return answer;
    }
}