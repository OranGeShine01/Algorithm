import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int emp = schedules.length;
        boolean[] isNotGetPrices = new boolean[emp];
        
        for (int i = 0; i < 7; i++) {
            int currDay = (startday + i) % 7;
            if (currDay != 6 && currDay != 0) {
                for (int j = 0; j < emp; j++) {
                    if (isNotGetPrices[j]) continue;
                    int deadLine = convertTime(schedules[j]) + 10;
                    int[] currTimelog = timelogs[j];
                    if (deadLine < convertTime(currTimelog[i])) isNotGetPrices[j] = true;
                }
            }
        }
        
        for (boolean b : isNotGetPrices) if (!b) answer++;
        return answer;
    }
    
    int convertTime(int time) {
        return time / 100 * 60 + time % 100;
    }
}