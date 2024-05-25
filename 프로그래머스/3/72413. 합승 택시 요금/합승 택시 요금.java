class Solution {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        
        // 연결되지 않은 node 초기화를 위한 수
        final int INF = 20000001;
        
        int answer = INF;
        int[][] graph = new int[n + 1][n + 1];
        
        // graph 초기화
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                graph[i][j] = (i == j) ? 0 : INF;
            }
        }
        
        for (int[] fare : fares) {
            int fst = fare[0];
            int sec = fare[1];
            int cost = fare[2];
            graph[fst][sec] = cost;
            graph[sec][fst] = cost;
        }
        
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (graph[j][k] > graph[j][i] + graph[i][k]) {
                        graph[j][k] = graph[j][i] + graph[i][k];
                    }
                }
            }
        }
        
        for (int i = 1; i <= n; i++) {
            int cost = graph[s][i] + graph[i][a] + graph[i][b];
            if (cost < answer) {
                answer = cost;
            }
        }
        
        return answer;
    }
}