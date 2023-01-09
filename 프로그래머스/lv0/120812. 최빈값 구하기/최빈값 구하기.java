import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] count = new int[1000];
        for (int i : array) {
            count[i]+=1;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<1000; i++) {
            if (count[i]>0) {
                map.put(count[i], i);
            }
        }
        
        
        
        
        Arrays.sort(count);
        if (count[999]==count[998]) {
            answer = -1;
        } else {
            answer = map.get(count[999]);
        }
        
        return answer;
    }
}