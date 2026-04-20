import java.util.*;

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;
        
        int left = 1;
        int right = 0;
        
        for (int i : diffs) {
            right = Math.max(right, i);
        }
        
        while (left <= right) {
            int mid = (left + right) / 2;
            if ((exeTime(diffs, times, mid)) <= limit) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return answer;
    }
    
    static long exeTime(int[] diffs, int[] times, int level) {
        int n = diffs.length;
        long timePrev = 0;
        long result = 0;
        
        for (int i = 0; i < n; i++) {
            if (level >= diffs[i]) {
                result += times[i];
            } else {
                result += (times[i] + timePrev) * (diffs[i] - level) + times[i];
            }
            timePrev = times[i];
        }
        return result;
    }
}