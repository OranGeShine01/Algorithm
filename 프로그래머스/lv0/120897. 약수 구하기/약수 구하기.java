import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i=1; i<=Math.sqrt(n); i++) {
            if (n%i==0) {
                queue.add(i);
                if (n!=Math.pow(i,2)) {
                    queue.add(n/i);    
                }                
            }
        }
        
        answer = new int[queue.size()];
        
        for (int i=0; i<answer.length; i++) {
            answer[i] = queue.poll();
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}