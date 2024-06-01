import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        PriorityQueue<int[]> attendedList = new PriorityQueue<>((o1, o2) -> 
            o1[1] - o2[1]);
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) attendedList.add(new int[]{i, rank[i]});
        }
        
        return 10000 * attendedList.poll()[0] + 100 * attendedList.poll()[0] + 
            attendedList.poll()[0];
    }
}