import java.util.*;

class Solution {
    
    Set<String> set;
    boolean[] visited;
    
    public int solution(String[] user_id, String[] banned_id) {
        set = new HashSet<>();
        visited = new boolean[user_id.length];
        
        // 정규식을 위해 * 을 .으로 대체
        for (int i = 0; i < banned_id.length; i++) {
            banned_id[i] = banned_id[i].replace("*", ".");
        }
        
        dfs(0, user_id, banned_id, "");
        
        return set.size();
    }
    
    void dfs(int depth, String[] user_id, String[] banned_id, String str) {
        if (depth == banned_id.length) {
            String[] arr = str.split(" ");
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();
            for (String s : arr) {
                sb.append(s);
            }
            set.add(sb.toString());
            return;
        }
        
        for (int i = 0; i < user_id.length; i++) {
            if (visited[i] || !user_id[i].matches(banned_id[depth])) continue;
            visited[i] = true;
            dfs(depth + 1, user_id, banned_id, str + " " + user_id[i]);
            visited[i] = false;
        }
    }
    
    
}