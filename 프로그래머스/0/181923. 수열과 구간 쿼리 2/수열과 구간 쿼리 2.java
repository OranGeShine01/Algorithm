import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int idx = 0;
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            int cnt = Integer.MAX_VALUE;
            for (int i = s; i <= e; i++) {
                if (arr[i] > k && arr[i] < cnt) cnt = arr[i];
            }
            answer[idx] = (cnt == Integer.MAX_VALUE) ? -1 : cnt;
            idx++;
        }
        return answer;
    }
}