import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] arr = s.split(" ");
        int l = arr.length;
        Stack<Integer> stack = new Stack<>(); // 숫자를 받을 스택.
        
        for (int i=0; i<l; i++) {
        	if (arr[i].equals("Z")) {
        		answer-=stack.pop();
        	} else {
        		stack.push(Integer.parseInt(arr[i]));
        		answer+=stack.peek();
        	}
        }        
        
        return answer;
    }
}