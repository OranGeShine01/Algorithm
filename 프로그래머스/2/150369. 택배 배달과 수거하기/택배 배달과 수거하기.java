class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        
        // 현재 트럭이 처리할수있는 d, p값
        int d = 0;
        int p = 0;
        for (int i = n - 1; i >= 0; i--) {
            d -= deliveries[i];
            p -= pickups[i];
            while (d < 0 || p < 0) {
                d += cap;
                p += cap;
                answer += (i+1) * 2;
            }
            
        }
        return answer;
    }
}