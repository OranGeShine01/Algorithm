import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for (int i=score.length; i>0; i-=m) {
            if (i>=m) {
                answer+=score[i-m]*m;
            }
        }
        return answer;
    }
}