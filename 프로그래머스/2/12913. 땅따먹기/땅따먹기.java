class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int l = land[0].length;

        for (int i=1; i<land.length; i++) {
            for (int j=0; j<l; j++) {
                int max = 0;
                for (int k=0; k<l; k++) {
                    if (j==k) continue;
                    else max = Math.max(max, land[i-1][k]);
                }
                land[i][j]+=max;
            }
        }
        
        for (int i : land[land.length-1]) {
            answer = Math.max(answer, i);
        }

        return answer;
    }
}