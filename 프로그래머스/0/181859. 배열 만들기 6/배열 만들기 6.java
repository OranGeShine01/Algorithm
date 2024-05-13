import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if (answer.size() == 0) {
                answer.add(arr[i]);
                i++;
            } else if (answer.get(answer.size() - 1) == arr[i]) {
                answer.remove(answer.size() - 1);
                i++;
            } else {
                answer.add(arr[i]);
                i++;
            }
        }
        return answer.size() == 0 ? new ArrayList<>(Arrays.asList(-1)) : answer;

    }
}