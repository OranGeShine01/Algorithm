import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            int range = (end - start) / 2;
            for (int i = 0; i<= range; i++) {
                int sIdx = start + i;
                int eIdx = end - i;
                char temp = arr[sIdx];
                arr[sIdx] = arr[eIdx];
                arr[eIdx] = temp;
            }
        }
        return new String(arr);
    }
}