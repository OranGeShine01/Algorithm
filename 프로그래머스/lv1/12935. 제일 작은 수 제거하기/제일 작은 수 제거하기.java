import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if (arr.length==1) {
            return new int[]{-1};
        }
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            min = Math.min(i, min);
        }

        Queue<Integer> queue = new LinkedList<>();
        int l = arr.length-1;
        answer = new int[l];
        for (int i : arr) {
            if (min!=i) {
                queue.add(i);
            }
        }
        for (int i=0; i<l; i++) {
            answer[i] = queue.poll();
        }

        return answer;
    }
}