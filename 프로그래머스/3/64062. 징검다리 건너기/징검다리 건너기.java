class Solution {
    public int solution(int[] stones, int k) {
        
        final int limit = 200000000;
        
        int min = 0;
        int max = limit;
        int answer = 0;
        
        while(min <= max) {
            int mid = (min + max) / 2;
            
            if (canCross(stones, k, mid)) {
                answer = mid;
                min = mid + 1;
            } else max = mid - 1;
        }
        
        return answer;
    }
    
    // 징검다리를 건널 수 있는지 판별
    boolean canCross(int[] stones, int k, int mid) {
        int cnt = 0;
        for (int stone : stones) {
            if (mid > stone) {
                cnt++;
                if (cnt >= k) return false;
            }
            else cnt = 0;
        }
        return true;
    }
}