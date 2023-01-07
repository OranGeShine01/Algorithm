import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i=0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (ch>='0' && ch<='9') {
                arr.add(ch-48);
            }
        }
        
        answer = new int [arr.size()];        
        
        for (int i=0; i<answer.length; i++) {
            answer[i] = arr.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}