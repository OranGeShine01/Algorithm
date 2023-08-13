import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        int l = numbers.length;
        for (int i=0; i<l-1; i++) {
            for (int j=i+1; j<l; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}