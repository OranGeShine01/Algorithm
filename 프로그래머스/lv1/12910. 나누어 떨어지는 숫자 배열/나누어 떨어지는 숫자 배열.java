import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
        public int[] solution(int[] arr, int divisor) {
            int[] answer = {};
            Arrays.sort(arr);
            Queue<Integer> queue = new LinkedList<>();
            for (int i : arr) {
                if (i%divisor==0) {
                    queue.add(i);
                }
            }
            
            if (queue.isEmpty()) {
                return answer = new int[]{-1};
            }
            
            answer = new int[queue.size()];
            for (int i=0; i<answer.length; i++) {
                answer[i] = queue.poll();
            }
            return answer;
        }
}