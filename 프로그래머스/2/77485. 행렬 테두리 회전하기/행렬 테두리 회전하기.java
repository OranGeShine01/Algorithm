import java.util.*;

class Solution {
    
    int[][] arr;
    Queue<Integer> q;
    final int max = 10001;
    
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = {};
        
        arr = new int[rows][columns];
        q = new LinkedList<>();
        
        int num = 1;
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                arr[i][j] = num;
                num++;
            }
        }
        
        for (int[] query : queries) {
            q.add(rotate(query));
        }
        
        answer = new int[q.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = q.poll();
        }
        
        return answer;
    }
    
    int rotate (int[] query) {
        int x1 = query[0]-1;
        int x2 = query[2]-1;
        int y1 = query[1]-1;
        int y2 = query[3]-1;
        
        int cnt = arr[x1][y1];
        int[] temp = {arr[x1][y2], 0};
        for (int i=y2; i>y1; i--) {
            cnt = Math.min(cnt, arr[x1][i]);
            arr[x1][i] = arr[x1][i-1];
        }
        
        temp[1] = arr[x2][y2];
        for (int i=x2; i>x1; i--) {
            cnt = Math.min(cnt, arr[i][y2]);
            if (i!=x1+1) arr[i][y2] = arr[i-1][y2];
            else arr[i][y2] = temp[0];
        }
        
        temp[0] = arr[x2][y1];
        for (int i=y1; i<y2; i++) {
            cnt = Math.min(cnt, arr[x2][i]);
            if (i!=y2-1) arr[x2][i] = arr[x2][i+1];
            else arr[x2][i] = temp[1];
        }
        
        for (int i=x1; i<x2; i++) {
            cnt = Math.min(cnt, arr[i][y1]);
            if (i!=x2-1) arr[i][y1] = arr[i+1][y1];
            else arr[i][y1] = temp[0];
        }
        
        return cnt;
    }    
    
}