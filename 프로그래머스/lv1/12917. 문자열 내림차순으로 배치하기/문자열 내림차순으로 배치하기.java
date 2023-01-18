import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        int l = s.length();
        char[] arr = new char[l];
        for (int i=0; i<l; i++) {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i=l-1; i>=0; i--) {
            sb.append(arr[i]);
        }
        answer = sb.toString();
        return answer;
    }
}