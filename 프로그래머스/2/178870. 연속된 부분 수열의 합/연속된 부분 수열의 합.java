import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int len = sequence.length;
        int[] answer = new int[]{-1, -1};
        int sum = 0;
        int left = 0;
        int bestLen = len + 1;
        
        for (int right = 0; right < len; right++) {
            sum += sequence[right];
            
            while (sum > k) {
                sum -= sequence[left];
                left++;
            }
            
            if (sum == k && right - left + 1 < bestLen) {
                bestLen = right - left + 1;
                answer[0] = left;
                answer[1] = right;
            }
        }     
        
        return answer;
    }
}