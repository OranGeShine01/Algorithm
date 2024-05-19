class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        // 승자, 패자를 기록할 graph
        int[][] graph = new int[n + 1][n + 1];
        
        // input값 반영
        for (int[] result : results) {
            int winner = result[0];
            int loser = result[1];
            graph[winner][loser] = 1;
            graph[loser][winner] = -1;
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    // i > j 이고 j > k 면 i > k
                    if (graph[i][j] == 1 && graph[j][k] == 1) {
                        graph[i][k] = 1;
                        graph[k][i] = -1;
                    }
                    // j > i 이고 k < j 면 k > i
                    else if (graph[j][i] == 1 && graph[k][j] == 1) {
                        graph[k][i] = 1;
                        graph[i][k] = -1;
                    }
                }
            }
        }
        
        for (int[] arr : graph) {
            int cnt = 0;
            for (int i : arr) {
                if (i != 0) cnt++;
            }
            if (cnt == n - 1) answer++;
        }
        
        return answer;
    }
}