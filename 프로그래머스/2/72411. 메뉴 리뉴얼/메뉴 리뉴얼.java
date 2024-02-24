import java.util.*;

class Solution {
    
    static Map<String, Integer> map;
    
    public String[] solution(String[] orders, int[] course) {
        
        String[] arr = new String[orders.length];
        PriorityQueue<String> queue = new PriorityQueue<>();
        
        for (int i=0; i<orders.length; i++) {
            char[] ch = orders[i].toCharArray();
            Arrays.sort(ch);
            arr[i] = String.valueOf(ch);
        }
        
        for (int i : course) {
            map = new HashMap<>();
            int max = 0;
            for (String s : arr) {
                boolean[] visited = new boolean[s.length()];
                dfs(visited, i, s, new StringBuilder(), 0);
            }
            
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                max = Math.max(max, e.getValue());
            }
            
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                if (max>=2 && e.getValue()==max) queue.add(e.getKey());
            }
        }
        
        String[] answer = new String[queue.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = queue.poll();
        }
        
        return answer;
    }
    
    void dfs(boolean[] visited, int n, String s, StringBuilder sb, int idx) {
        int l = s.length();
        if (l<n) return;
        
        int bl = sb.length();
        if (bl==n) {
            String str = sb.toString();
            map.put(str, map.getOrDefault(str, 0)+1);
            return;
        }
        
        for (int i=idx; i<l; i++) {
                sb.append(s.charAt(i));
                dfs(visited, n, s, sb, i+1);
                sb.deleteCharAt(sb.length() - 1);
        }
    }
}