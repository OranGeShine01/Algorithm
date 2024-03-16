import java.util.*;

class Solution {
    
    public int solution(String s) {
        final int limit = 1001;
        int answer = limit;
        int len = s.length();
        if (len==1) return 1;
        for (int i=1; i<=len/2; i++) {
            answer = Math.min(answer, extract(s, i));
        }
        return answer;
    }
    
    int extract (String s, int n) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        String unit = s.substring(0, n);
        Queue<String> q = new LinkedList<>();
        int cnt = 0;
        
        for (int i=0; i<len; i+=n) {
            q.add(s.substring(i, Math.min(i+n, len)));
        }
        
        while (!q.isEmpty()) {
            if (unit.equals(q.peek())) {
                q.poll();
                cnt++;
            } else {
                if (cnt>1) sb.append(cnt);
                sb.append(unit);
                unit = q.peek();
                cnt = 0;
            }
        }
        
        if (cnt>1) sb.append(cnt);
        sb.append(unit);
        
        return sb.length();
    }
    
}