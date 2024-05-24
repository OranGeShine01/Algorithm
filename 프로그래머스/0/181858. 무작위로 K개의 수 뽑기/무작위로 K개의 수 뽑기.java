import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (!set.contains(i)) {
                set.add(i);
                q.add(i);
            }
            if (q.size() >= k) break;
        }
        while (q.size() < k) {
            q.add(-1);
        }
        for (int i = 0; i < k; i++) {
            answer[i] = q.poll();
        }
        return answer;
    }
}