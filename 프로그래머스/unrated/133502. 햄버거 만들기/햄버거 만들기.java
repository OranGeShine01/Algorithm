import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<ingredient.length; i++) {
            stack.add(ingredient[i]);
            int s = stack.size();
            if (stack.size()>=4 && stack.peek()==1
                && stack.get(s-2)==3 && stack.get(s-3)==2 && stack.get(s-4)==1) {
                answer++;
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
            }
        }

        return answer;
    }
}