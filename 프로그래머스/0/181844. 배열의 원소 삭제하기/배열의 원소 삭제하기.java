import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        boolean[] bl = new boolean[arr.length];
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0; i<arr.length; i++) {
            for (int j : delete_list) {
                if (arr[i]==j) {
                    bl[i] = true;
                    break;
                }
            }
            if (!bl[i]) queue.add(arr[i]);
        }
        int[] answer = new int[queue.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = queue.poll();
        }
        return answer;
    }
}