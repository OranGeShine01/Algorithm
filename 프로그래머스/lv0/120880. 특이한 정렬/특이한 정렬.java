import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[][] arr = new int[numlist.length][2];
        for (int i=0; i<numlist.length; i++) {
            arr[i][0] = Math.abs(n-numlist[i]);
            arr[i][1] = numlist[i]-n;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0]) return o2[1]-o1[1];
                else return o1[0]-o2[0];
            }
        });

        for (int i=0; i<numlist.length; i++) {
            answer[i] = arr[i][1]+n;
        }

        return answer;
    }
}