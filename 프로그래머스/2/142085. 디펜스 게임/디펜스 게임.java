import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : enemy) {
            n-=i;
            pq.add(i);
            if (n<0) {
                while (k>0 && n<0) {
                    n+=pq.poll();
                    k--;
                }
            }
            if (n>=0) answer++;
            else break;
        }
        return answer;
    }
}