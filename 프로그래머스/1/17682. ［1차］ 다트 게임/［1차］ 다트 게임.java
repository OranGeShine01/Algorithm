import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] score = new int[3];
        char[] arr = dartResult.toCharArray();
        int chance = -1;
        boolean ten = false;
        
        for (char ch : arr) {
            if (ch>='0' && ch<='9') {
                if (ch=='0' && ten) score[chance] = 10;
                else {
                    chance++;
                    score[chance] = ch-'0';
                }
            } else if (ch=='D') {
                score[chance]*=score[chance];
            } else if (ch=='T') {
                score[chance] = (int)Math.pow(score[chance], 3);
            } else if (ch=='#') {
                score[chance]*=-1;
            } else if (ch=='*') {
                score[chance]*=2;
                if (chance!=0) score[chance-1]*=2;
            }
            ten = (ch=='1') ? true : false;
        }
        
        for (int i : score) {
            answer+=i;
        }
        
        return answer;
    }
}