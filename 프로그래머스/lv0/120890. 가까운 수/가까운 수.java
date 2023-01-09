import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int l = array.length;
        int[] array2 = new int[l];
        boolean sameDistance = false; // 같은거리여부
        Set <Integer> set = new HashSet<>();
        
        for (int i=0; i<l; i++) {
        	set.add(array[i]);
            array2[i] = Math.abs(array[i]-n);
        }
        
        Arrays.sort(array2);
        if (set.contains(n-array2[0])) {
        	answer = n-array2[0];
        } else {
        	answer = n+array2[0];
        }
        
        return answer;
    }
}