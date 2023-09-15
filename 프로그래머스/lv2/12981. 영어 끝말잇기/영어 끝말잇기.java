import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> set = new HashSet<>();
        int l = words.length;
        char last = words[0].charAt(words[0].length()-1);
        set.add(words[0]);
        for (int i=1; i<l; i++) {
            char first = words[i].charAt(0);
            if (set.contains(words[i]) || first!=last) {
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                break;
            } else {
                set.add(words[i]);
                last = words[i].charAt(words[i].length()-1);
            }
        }

        return answer;
    }
}