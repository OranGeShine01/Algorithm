import java.util.*;

class Solution {
    
    int[][] arr;
    int[] ansCnts;
    int answer;
    int N;
    
    public int solution(int n, int[][] q, int[] ans) {
        answer = 0;
        int[] comb= new int[5];
        ansCnts = ans;
        arr = q;
        N = n;
        
        dfs(1, comb, 0);
        
        return answer;
    }
    
    void dfs(int start, int[] comb, int depth) {
        
        if (depth == 5) {
            if (calcAnswer(comb)) answer++;
            return;
        }
        
        for (int i = start; i <= N ; i++) {
            comb[depth] = i;
            dfs(i + 1, comb, depth + 1);
        }
    }
    
    boolean calcAnswer(int[] comb) {
        int m = arr.length;
        for (int i = 0; i < m; i++) {
            int cnt = 0;
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (comb[j] == arr[i][k]) cnt++;
                }
            }
            if (cnt != ansCnts[i]) return false;
        }
        return true;
    }
}