import java.util.*;

class Solution {
    
    final int maxTime = 1450;
    final int hour = 60;
    final int clean = 10;
    
    public int solution(String[][] book_time) {
        int time[][] = new int[book_time.length][2];
        int cnt = 0;
        
        for (int i=0; i<time.length; i++) {
            for (int j=0; j<time[0].length; j++) {
                String[] str = book_time[i][j].split(":");
                time[i][j] = Integer.parseInt(str[0]) * hour + Integer.parseInt(str[1]);
                if (j==1) {
                    time[i][j]+=clean;
                }
            }
        }
        
        Arrays.sort(time, (o1, o2) -> {
            return o1[0]-o2[0];
        });
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
        
        for (int[] t : time) {
            if (!pq.isEmpty() && t[0]>=pq.peek()[1]) {
                pq.poll();
            }
            pq.add(t);
        }
        
        return pq.size();
    }
}