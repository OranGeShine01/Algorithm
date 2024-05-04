class Solution {
    
    
    
    public int solution(int sticker[]) {
        int answer = 0;
        int len = sticker.length;
        
        // len = 1 일때 예외처리
        if (len == 1) return sticker[0];
        
        // 첫번째 스티커를 택한 경우 dp
        int[] dp1 = new int[len];
        // 첫번째 스티커를 택하지 않은 경우 dp
        int[] dp2 = new int[len];
        
        // 초기화
        for (int i = 0; i <= 1; i++) {
            dp1[i] = sticker[0];
        }
        
        dp2[1] = sticker[1];
        
        for (int i = 2; i < len; i++) {
            dp1[i] = Math.max(dp1[i - 2] + sticker[i], dp1[i - 1]);
            dp2[i] = Math.max(dp2[i - 2] + sticker[i], dp2[i - 1]);
        }

        return Math.max(dp1[len - 2], dp2[len - 1]);
    }
}