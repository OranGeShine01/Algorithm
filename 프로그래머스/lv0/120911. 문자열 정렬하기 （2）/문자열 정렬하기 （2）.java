import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = new char[my_string.length()];
        for (int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (ch<'a') {
                arr[i] = (char)(ch+32);
            } else {
                arr[i] = ch;
            }
        }
        
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
        for (char i : arr) {
            sb.append(i);
        }
        
        answer = sb.toString();
        return answer;
    }
}