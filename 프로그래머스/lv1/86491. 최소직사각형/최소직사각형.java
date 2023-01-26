import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        for (int[] i : sizes) {
            Arrays.sort(i);
        }
        int maxW = -1;
        int maxH = -1;
        for (int[] i : sizes) {
            maxW = Math.max(maxW, i[0]);
            maxH = Math.max(maxH, i[1]);
        }
        return maxW * maxH;
    }
}