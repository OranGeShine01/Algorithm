import java.util.Stack;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int l = my_string.length();
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<l; i++) {
        	char ch = my_string.charAt(i);
        	if (ch>='0' && ch<='9') {
        		stack.add(Character.digit(ch, 10));
        	} else {
        		answer += assemble(stack);
        	}
        }
        
        if (!stack.isEmpty()) {
        	answer+=assemble(stack);
        }
        
        return answer;
    }
    
    public int assemble(Stack<Integer> stack) {
    	int answer=0;
    	int size = stack.size();
		for (int i=0; i<size; i++) {        			
			answer += Math.pow(10, i) * stack.pop();
		}
		return answer;
    }
}