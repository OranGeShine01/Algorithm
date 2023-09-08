import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int l = score.length;
        int[] answer = new int[l];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<l; i++) {
            if (k>i) {
                list.add(score[i]);
                Collections.sort(list);
            }
            else {
                if (list.get(0)<score[i]) {
                    list.remove(0);
                    list.add(score[i]);
                    Collections.sort(list);
                }
            }
            answer[i] = list.get(0);
        }
        return answer;
    }
}