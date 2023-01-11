import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String nStr = String.valueOf(n);
        int l = nStr.length();
        char[] ch = new char[l];
        for (int i=0; i<l; i++) {
        	ch[i] = nStr.charAt(i);
        }
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder();
        for (int i=ch.length-1; i>=0; i--) {
        	sb.append(ch[i]);
        }
        return Long.parseLong(sb.toString());
        
    }
}