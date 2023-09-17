class Solution {
    
    static Long[] dp;
    
    public long solution(int n) {
        dp = new Long[n+1];
        dp[0] = 1L;
        dp[1] = 1L;
        long answer = jump(n);
        return answer;
    }
    
    public long jump(int n) {
        if (dp[n]==null) {
            dp[n] = (jump(n-1) + jump(n-2))%1234567;
        }
        return dp[n];
    }
}