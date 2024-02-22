import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)*n/2];
        int[][] arr = new int[n][n];
        int x = -1;
        int y = 0;
        int k = 0;
        
        for(int i=0; i<n; i++) {
            for (int j=i; j<n; j++) {
                int dir = i%3;
                if (dir==0) x++;
                else if (dir==1) y++;
                else {
                    x--;
                    y--;
                }
                arr[x][y] = ++k;
            }
        }
        
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<=i; j++) {
                queue.add(arr[i][j]);
            }
        }
        
        for (int i=0; i<answer.length; i++) {
            answer[i] = queue.poll();
        }
        
        return answer;
    }
}