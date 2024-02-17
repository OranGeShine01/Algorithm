class Solution {
    
    static int[] answer = {0, 0};
    
    public int[] solution(int[][] arr) {
        dc(arr, 0, 0, arr.length);
        return answer;
    }
    
    public void dc(int[][] arr, int x, int y, int n) {
        if (n==1) count(arr[x][y]);
        else {
            boolean bl = false;
            for (int i=x; i<x+n; i++) {
                for (int j=y; j<y+n; j++) {
                    if (arr[x][y]!=arr[i][j]) {
                        bl = true;
                        break;
                    }
                }
                if (bl) break;
            }
            if (!bl) count(arr[x][y]);
            else {
                dc(arr, x, y, n/2);
                dc(arr, x+n/2, y, n/2);
                dc(arr, x, y+n/2, n/2);
                dc(arr, x+n/2, y+n/2, n/2);
            }
        }
    }
    
    public void count(int k) {
        if (k == 0) answer[0]++;
            else answer[1]++;
    }
}