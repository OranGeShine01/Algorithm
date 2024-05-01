class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        
        // 현재위치
        int cur = 1;
        
        // station index
        int idx = 0;
        
        while (cur <= n) {
            if (idx >= stations.length || cur < stations[idx] - w) {
                answer++;
                cur += 2 * w + 1;
            } else {
                cur = stations[idx] + w + 1;
                idx++;
            }
        }

        return answer;
    }
}