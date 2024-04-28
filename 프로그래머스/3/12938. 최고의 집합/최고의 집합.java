class Solution {
    public int[] solution(int n, int s) {
        int[] answer = {};
        
        if (s < n) return new int[]{-1};
        
        int quot = s / n;
        int remain = s % n;
        
        answer = new int[n];
        
        for (int i = 0; i < n; i++) {
            answer[i] = (i >= n - remain) ? quot + 1 : quot;
        }
        
        return answer;
    }
}