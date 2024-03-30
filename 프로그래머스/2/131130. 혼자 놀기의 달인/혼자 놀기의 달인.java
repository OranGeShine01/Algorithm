import java.util.*;

class Solution {
    public int solution(int[] cards) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        boolean[] visited = new boolean[cards.length];
        for (int i=0; i<cards.length; i++) {
            if (visited[i]) continue;
            int cnt = 0;
            int cur = i;
            while (!visited[cur]) {
                cnt++;
                visited[cur] = true;
                cur = cards[cur] - 1;
            }
            pq.add(cnt);
        }
        return pq.size() >= 2 ? pq.poll() * pq.poll() : 0;
    }
}