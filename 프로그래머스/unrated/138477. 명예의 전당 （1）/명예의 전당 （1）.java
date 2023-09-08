import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int l = score.length;
        int[] answer = new int[l];
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i=0; i<l; i++) {
            if (k>i) {
                queue.add(score[i]);
            }
            else {
                if (queue.peek()<score[i]) {
                    queue.poll();
                    queue.add(score[i]);
                }
            }
            answer[i] = queue.peek();
        }
        return answer;
    }
}