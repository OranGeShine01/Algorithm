import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int cl = commands.length;
        int[] answer = new int[cl];
        for (int l=0; l<cl; l++) {
            int i = commands[l][0];
            int j = commands[l][1];
            int k = commands[l][2];
            int[] sp = new int[j-i+1];
            int sl = sp.length;
            for (int m=0; m<sl; m++) {
                sp[m] = array[i+m-1];
            }
            Arrays.sort(sp);
            answer[l] = sp[k-1];
        }
        return answer;
    }
}