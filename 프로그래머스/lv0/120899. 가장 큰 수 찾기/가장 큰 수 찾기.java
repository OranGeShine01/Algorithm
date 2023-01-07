import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};
        answer = new int[2];
        Map <Integer, Integer> map = new HashMap<>();
        for (int i=0; i<array.length; i++) {
            map.put(array[i], i);
        }
        Arrays.sort(array);
        
        answer[0] = array[array.length-1];
        answer[1] = map.get(answer[0]);
        return answer;
    }
}