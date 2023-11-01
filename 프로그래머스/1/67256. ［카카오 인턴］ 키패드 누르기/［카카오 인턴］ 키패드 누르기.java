import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int[] finger = {10, 12};
        
        for (int i : numbers) {
            int n=i;
            if (i==0) n=11;
            if (i==1 || i==4 || i==7) {
                sb.append('L');
                finger[0] = i;
            } else if (i==3 || i==6 || i==9) {
                sb.append('R');
                finger[1] = i;
            } else {
                int l = d(n, finger[0]);
                int r = d(n, finger[1]);
                if (l<r || (l==r && hand.equals("left"))) {
                    finger[0] = n;
                    sb.append('L');
                } else {
                    finger[1] = n;
                    sb.append('R');
                }
            }
        }
        
        return sb.toString();
    }
    
    public int d(int n, int f) {
        int t = Math.abs(n-f);
        return t/3+t%3;
    }
}