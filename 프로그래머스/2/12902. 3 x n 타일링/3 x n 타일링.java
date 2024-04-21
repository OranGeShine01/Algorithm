class Solution {
    
    long[] dp;
    final long div = 1000000007;
    
    public int solution(int n) {
        int hn = n / 2;
        dp = new long[hn + 1];
        
        if (n % 2 != 0) return 0;
        
        dp[1] = 3;
        
        for (int i = 2; i <= hn; i++) {
            dp[i] = (((dp[i - 1] % div) * (dp[1] % div)) % div + 2) % div;
            for (int j = 1; j < i - 1; j++) {
                dp[i] += ((dp[i - 1 - j] % div) * 2) % div;
            }
            dp[i] %= div;
        }
        
        return (int)dp[hn];
    }
}