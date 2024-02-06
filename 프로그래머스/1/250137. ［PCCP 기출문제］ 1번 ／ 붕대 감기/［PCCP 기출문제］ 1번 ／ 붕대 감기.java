import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int combo = 0;
        int maxTime = attacks[attacks.length-1][0];
        int n = 0;
        
        for (int i=0; i<=maxTime; i++) {
            if (attacks[n][0]==i) {
                combo = 0;
                answer-=attacks[n][1];
                n++;
                if (answer<=0) return -1;
            } else {
                answer+=bandage[1];
                combo++;
                if (combo==bandage[0]) {
                    answer+=bandage[2];
                    combo = 0;
                }
                if (answer>health) answer=health;
            }
        }
        
        return answer;
    }
}