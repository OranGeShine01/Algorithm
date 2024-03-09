import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        int answer = 0;
        
        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[col-1]!=o2[col-1]) return o1[col-1]-o2[col-1];
                else return o2[0]-o1[0];
            }
        });
        
        for (int i=row_begin-1; i<row_end; i++) {
            int s = 0;
            for (int j : data[i]) {
                s+=j%(i+1);
            }
            if (i==row_begin-1) answer = s;
            else answer ^= s;
        }
        
        return answer;
    }
}