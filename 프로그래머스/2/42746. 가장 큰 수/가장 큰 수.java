import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        int len = numbers.length;
        String[] arr = new String[len];
        for (int i = 0; i < len; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        if (arr[0].equals("0")) return "0";
        for (String s : arr) {
            answer.append(s);    
        }
        return answer.toString();
    }
}