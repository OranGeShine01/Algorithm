import java.util.*;

class Solution {
    final int limit = 100000;
    public int solution(String[] strArr) {
        int answer = 0;
        int[] cnt = new int[limit+1];
        for (String s : strArr) {
            int len = s.length();
            cnt[len]++;
        }
        
        for (int i : cnt) {
            answer = Math.max(i, answer);
        }
        
        return answer;
    }
}