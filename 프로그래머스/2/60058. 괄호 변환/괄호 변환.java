import java.util.*;

class Solution {
    public String solution(String p) {
        return recur(p);
    }
    
    public String recur(String w) {
        if (w.equals("")) return w;
        else if (pft(w)) return w;
        
        int l = w.length();
        int[] c = {0, 0};
        
        for (int i=0; i<l; i++) {
            char ch = w.charAt(i);
            if (ch=='(') c[0]++;
            else c[1]++;
            if (c[0]==c[1]) {
                String u = w.substring(0, i+1);
                String v = w.substring(i+1);
                StringBuilder sb = new StringBuilder();
                if (pft(u)) return sb.append(u).append(recur(v)).toString();
                return sb.append('(').append(recur(v)).append(')').append(u44(u)).toString();
            }
        }
        return w;
    }
    
    public boolean pft(String s) {
        int l = s.length();
        Stack<Character> stack = new Stack<>();
        
        for (int i=0; i<l; i++) {
            char ch = s.charAt(i);
            if (ch=='(') stack.add(ch);
            else if (stack.isEmpty()) {
                return false;
            } else stack.pop();
        }
        
        return true;
    }
    
    public String u44(String u) {
        int ul = u.length();
        String temp = u.substring(1, ul-1);
        StringBuilder sb = new StringBuilder();
        int tl = ul-2;
        for (int i=0; i<tl; i++) {
            char ch = temp.charAt(i);
            if (ch=='(') sb.append(')');
            else sb.append('(');
        }
        return sb.toString();
    }
}