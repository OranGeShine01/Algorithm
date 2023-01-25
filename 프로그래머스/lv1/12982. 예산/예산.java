import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i : d) {
            if (budget>=i) {
                answer+=1;
            }
            budget-=i;
        }
        return answer;
    }
}