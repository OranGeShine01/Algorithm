import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        stack.add(arr[0]);
        for (int i=1; i<arr.length; i++) {
            if (arr[i]!=stack.peek()) {
                stack.add(arr[i]);
            }
        }
        int l = stack.size();
        answer = new int[l];
        for (int i=l-1; i>=0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}