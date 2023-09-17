import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int[] min = {0, people[0]};
        for (int i=people.length-1; i>=min[0]; i--) {
            answer++;
            if (people[i]+min[1]<=limit) {
                min[0]++;
                min[1] = people[min[0]];
            }
        }
        return answer;
    }
}