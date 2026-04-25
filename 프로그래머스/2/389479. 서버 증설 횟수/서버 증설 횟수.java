import java.util.*;

class Solution {
    public int solution(int[] players, int m, int k) {
        
        final int MAX_TIME = players.length;
        
        int answer = 0;
        int[] extraCaps = new int[MAX_TIME];
        
        for (int i = 0; i < MAX_TIME; i++) {
            int currCap = m + extraCaps[i] - 1;
            int capGap = players[i] - currCap;
            if (players[i] > currCap) {
                int extraCap = players[i] - currCap;
                int extraServer = extraCap / m + (extraCap % m == 0 ? 0 : 1);
                for (int j = i; j < Math.min(i + k, MAX_TIME); j++) {
                    extraCaps[j] += extraServer * m;
                }
                answer += extraServer;
            }
        }
        
        return answer;
    }
}