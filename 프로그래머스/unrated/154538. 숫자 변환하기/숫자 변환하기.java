class Solution {
    
    static Integer dp[];
    
    public int solution(int x, int y, int n) {
        
        dp = new Integer[y+1];
        dp[x] = 0;
        for (int i=x; i<=y; i++) {
            if (dp[i]!=null) {
                int in = i+n;
                int i2 = i*2;
                int i3 = i*3;
                if (y>=in) {
                    dp[in] = (dp[in]==null) ? dp[i]+1 : Math.min(dp[i]+1, dp[in]);
                }
        
                if (y>=i2) {
                    dp[i2] = (dp[i2]==null) ? dp[i]+1 : Math.min(dp[i]+1, dp[i2]);    
                }
        
                if (y>=i3) {
                    dp[i3] = (dp[i3]==null) ? dp[i]+1 : Math.min(dp[i]+1, dp[i3]);
                }
            }
        }
        if (dp[y]==null) dp[y] = -1;
        return dp[y];
    }
}