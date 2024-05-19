public class Solution {
    public int solution(int n, int[] money) {
        final int DIV = 1000000007;
        // 배열의 n번째 요소 = n을 만드는 방법의 수
        int[] dp = new int[n + 1];
        // 초기화
        dp[0] = 1;

        for (int coin : money) {
            for (int i = coin; i < dp.length; i++) {
                dp[i] = (dp[i] + dp[i - coin]) % DIV;
            }
        }

        return dp[n];
    }
}