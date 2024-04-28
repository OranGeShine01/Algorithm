class Solution {
    
    final int quot = 1000000007;
    int[] fact;
    
    public int solution(int m, int n, int[][] puddles) {
        
        int[][] dp = new int[m][n];
        
        for (int[] puddle : puddles) {
            dp[puddle[0] - 1][puddle[1] - 1] = -1;
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    if (j == 0) dp[i][j] = 1;
                    else if (dp[i][j] != -1) dp[i][j] = dp[i][j - 1];
                } else if (j == 0) {
                    if (dp[i][j] != -1) dp[i][j] = dp[i - 1][j];
                } else if (dp[i][j] != -1) {
                    if (dp[i-1][j] != -1) {
                        dp[i][j] += dp[i-1][j] % quot;
                    }
                    if (dp[i][j-1] != -1) {
                        dp[i][j] += dp[i][j-1] % quot;
                    }
                    dp[i][j] %= quot;
                }            
            }
        }
        
        
        return dp[m-1][n-1];
    }
}