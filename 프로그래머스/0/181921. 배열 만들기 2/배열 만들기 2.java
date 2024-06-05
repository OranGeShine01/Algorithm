import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).matches("[05]+")) {
                answer.add(i);
            };
        }
        if (answer.isEmpty()) answer.add(-1);
        return answer;
    }
}