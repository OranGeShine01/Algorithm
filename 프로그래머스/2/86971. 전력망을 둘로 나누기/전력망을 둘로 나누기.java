class Solution {
    int N, answer;
    int[][] map;
    boolean[] vst;
    int dfs(int n){
        vst[n] = true;
        int child = 1;
        for(int i = 1; i <= N; i++) {
            if(!vst[i] && map[n][i] == 1) {
                vst[i] = true;
                child += dfs(i);
            }
        }
        answer = Math.min(answer, Math.abs(2 * child - N));
        return child;
    }
    public int solution(int n, int[][] wires) {
        N = n;
        answer = n;
        map = new int[n+1][n+1];
        vst = new boolean[n+1];
        for(int[] wire : wires) {
            int a = wire[0], b = wire[1];
            map[a][b] = map[b][a] = 1;
        }
        dfs(1);
        return answer;
    }
}