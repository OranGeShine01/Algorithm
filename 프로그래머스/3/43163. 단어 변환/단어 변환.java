import java.util.*;

class Solution {
    
    int answer;
    
    public int solution(String begin, String target, String[] words) {
        answer = 0;
        boolean visited[] = new boolean[words.length];
        dfs(0, begin, target, words, visited);
        return answer;
    }
    
    void dfs(int depth, String cur, String target, String[] words, boolean[] visited) {
        if (cur.equals(target)) {
            answer = (answer == 0) ? depth : Math.min(answer, depth);
            return;
        }
        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && countingDiff(cur, words[i]) == 1) {
                visited[i] = true;
                dfs(depth + 1, words[i], target, words, visited.clone());
                visited[i] = false;
            }
        }
    }
    
    int countingDiff(String a, String b) {
        int len = a.length();
        int result = 0;
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) result++;
        }
        return result;
    }
}