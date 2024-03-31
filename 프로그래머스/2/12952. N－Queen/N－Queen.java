class Solution {
    
    int answer;
    // 퀸의 위치배열, idx = row, value = column.
    int[] queen;
    
    public int solution(int n) {
        answer = 0;
        queen = new int[n];
        dfs(0, n);
        return answer;
    }
    
    void dfs(int depth, int n) {
        if (depth == n) {
            answer++;
            return;
        }
        for (int i=0; i<n; i++) {
            queen[depth] = i;
            if (check(depth)) dfs(depth+1, n);
        }
        
    }
    
    boolean check(int depth) {
        for (int i=0; i<depth; i++) {
            if (queen[i] == queen[depth] || Math.abs(i - depth) == Math.abs(queen[i] - queen[depth])) {
                return false;
            }
        }
        return true;
    }
}