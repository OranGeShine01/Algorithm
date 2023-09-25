import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int l = citations.length;
        boolean h = false;
        for (int i=l-1; i>=0; i--) {
            if (l-i>citations[i]) return l-i-1;
            else if (l-i==citations[i]) return citations[i];
        }
        if (citations[0]==0) return 0;
        else return l;
    }
}