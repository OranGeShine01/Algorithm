class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int r = arr.length;
        int c = arr[0].length;
        int len = Math.max(r, c);
        answer = new int[len][len];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                answer[i][j] = arr[i][j];
            }
        }        
        
        return answer;
    }
}