import java.util.*;

class Solution {
    
    Set<Integer> set;
    boolean[] visited;
    
    public int solution(String numbers) {
        set = new HashSet<>();
        int l = numbers.length();
        visited = new boolean[l];
        int answer = 0;
        
        for (int i=1; i<=l; i++) {
            dfs(numbers, "", i);
        }
        
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (prime(num)) answer++;
        }
        
        return answer;
    }
    
    void dfs(String numbers, String str, int n) {
        int l = numbers.length();
        int l2 = str.length();
        if (l2==n) {
            set.add(Integer.parseInt(str));
            return;
        }        
        
        for (int i=0; i<visited.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(numbers, str+numbers.charAt(i), n);
                visited[i] = false;
            }
        }
    }
    
    boolean prime(int k) {
        if (k<2) return false;
        double root = Math.sqrt(k);
        for (int i=2; i<=root; i++) {
            if (k%i==0) return false;
        }
        return true;
    }
}