import java.util.*;

class Solution {
    
    final int MAX_VALUE = 121;
    
    public int solution(int[][] info, int n, int m) {
        int answer = MAX_VALUE;
        int len = info.length;
        int[][] dp = new int[len + 1][m + 1];
        
        for (int i = 0; i <= len; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = MAX_VALUE;
            }
        }
        
        dp[0][0] = 0;
        
        for (int i = 0; i < len; i++) {
            int currA = info[i][0];
            int currB = info[i][1];
            for (int j = 0; j < m; j++) {
                if (dp[i][j] == MAX_VALUE) continue;
                if (currB + j < m) dp[i + 1][currB + j] = Math.min(dp[i][j], dp[i + 1][currB + j]);
                dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + currA);
            }
        }
        
        for (int i : dp[len]) {
            if (i < n) answer = Math.min(answer, i);
        }
        
        return answer == MAX_VALUE ? -1 : answer;
    }
}