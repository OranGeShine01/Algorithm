import java.util.*;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        
        int gcdA = arrayA[0];
        int gcdB = arrayB[0];
        boolean[] c = new boolean[2];
        
        for (int i=1; i<arrayA.length; i++) {
            gcdA = gcd(gcdA, arrayA[i]);
            gcdB = gcd(gcdB, arrayB[i]);
        }
        
        for (int i=0; i<arrayA.length; i++) {
            if (arrayB[i]%gcdA==0) c[0]=true;
            if (arrayA[i]%gcdB==0) c[1]=true;
            if (c[0] && c[1]) break;
        }
        
        if (!c[0]) answer = Math.max(answer, gcdA);
        if (!c[1]) answer = Math.max(answer, gcdB);
        
        return answer;
        
    }
    
    int gcd(int a, int b) {        
        return ((b%a==0) ? a : gcd(b%a, a));
    }
}