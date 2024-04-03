import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        Set<Integer> set = new HashSet<>();
        for (int i : indices) {
            set.add(i);
        }
        StringBuilder sb = new StringBuilder();
        int len = my_string.length();
        for (int i=0; i<len; i++) {
            if (!set.contains(i)) sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}