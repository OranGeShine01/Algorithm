import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = {count(a, answers), count(b, answers), count(c, answers)};
        int max = 0;
        for (int i : scores) {
            max = Math.max(max, i);
        }

        ArrayList<Integer> arr = new ArrayList<>();
        int l = scores.length;
        for (int i=0; i<l; i++) {
            if (max==scores[i]) {
                arr.add(i+1);
            }
        }

        int[] answer = new int[arr.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }

    // 정답수를 판별하는 method
    int count(int[] arr,int[] answers) {
        int n = 0;
        int l = arr.length;
        int l2 = answers.length;
        for (int i=0; i<l2; i++) {
            if (arr[i%l] == answers[i]) {
                n++;
            }
        }
        return n;
    }
}