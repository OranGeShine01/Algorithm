import java.util.*;

class Solution {
    
    final int blockLimit = 10000000;
    
    public int[] solution(long begin, long end) {
        int[] answer = new int[(int)(end - begin) + 1];
        for (int i=0; i<answer.length; i++) {
            int idx = (i + (int)begin);
            answer[i] = getMaxDivisor(idx);
        }
        return answer;
    }
    
    int getMaxDivisor (int n) {
        if (n == 1) return 0;
        double sqrt = Math.sqrt(n);
        
        Stack<Integer> s = new Stack<>();
        
        for (int i=2; i<=sqrt; i++) {
            
            if (n % i == 0) {
                s.push(i);
                if (n / i > blockLimit) continue;
                return n / i;
            }
        }
        
        if (!s.isEmpty()) {
         return s.pop();
        }
        
        return 1;
    }
}