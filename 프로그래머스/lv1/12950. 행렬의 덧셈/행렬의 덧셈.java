class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        int r = arr1.length; // row값
        int c = arr1[0].length; // colume값
        answer = new int[r][c];
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                answer[i][j]  = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}