import java.util.*;

class Solution {
    
    static Set<Integer> set;
    static int el;
    
    public int solution(int[] elements) {
        set = new HashSet<>();
        el = elements.length;
        
        for (int i=0; i<el; i++) {
            for (int j=1; j<=el; j++) {
                set.add(sum(elements, i, j));
            }
        }
        return set.size();
    }
    
    public int sum(int[] elements, int start, int l) {
        int sum = 0;
        for (int i=start; i<start+l; i++) {
            sum+=elements[i%el];
        }
        return sum;
    }
}