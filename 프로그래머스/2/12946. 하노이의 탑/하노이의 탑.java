import java.util.*;

class Solution {
    
    Queue<int[]> q;
    
    public int[][] solution(int n) {
        q = new LinkedList<>();
        recur(n, 1, 3);
        int[][] answer = new int[q.size()][2];
        for (int i=0; i<answer.length; i++) {
            answer[i] = q.poll();
        }
        
        return answer;
    }
    
    void recur(int k, int start, int end) {
        if (k==1) {
            q.add(new int[]{start, end});
            return;
        }
        
        int etc = 0;
        if ((start ==1 || start == 2) && (end == 1 || end == 2)) etc = 3;
        else if ((start == 2 || start == 3) && (end == 2 || end == 3)) etc = 1;
        else if ((start == 1 || start == 3) && (end == 1 || end == 3)) etc = 2;
        
        recur(k-1, start, etc);
        recur(1, start, end);
        recur(k-1, etc, end);
    }
}