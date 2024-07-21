import java.util.*;

class Solution {
    
    final int MIN_LENGTH = 9;
    
    public int solution(int N, int number) {
        
        if (N == number) return 1;
        Set<Integer>[] dp = new HashSet[MIN_LENGTH];
        
        for (int i = 1; i < MIN_LENGTH; i++) {
            dp[i] = new HashSet<>();
        }
        
        dp[1].add(N);
        
        for (int i = 2; i < MIN_LENGTH; i++) {
            String repeatedN = String.valueOf(N).repeat(i);
            dp[i].add(Integer.parseInt(repeatedN));
            
            for (int j = 1; j < i; j++) {
                int k = i - j;
                for (int num1 : dp[j]) {
                    for (int num2 : dp[k]) {
                        dp[i].add(num1 + num2);
                        dp[i].add(num1 - num2);
                        dp[i].add(num1 * num2);
                        if (num2 != 0) dp[i].add(num1 / num2);
                    }
                }
                
                if (dp[i].contains(number)) return i;
            }
            
        }
        
        return -1;
    }
}