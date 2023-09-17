import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i=1; i<arr.length; i++) {
            answer = answer * arr[i] / gcd(Math.min(answer, arr[i]), Math.max(answer, arr[i]));
        }
        return answer;
    }
    
    public int gcd (int a, int b) {
        if (a==0) return b;
        return gcd(b%a, a);
    }
}