class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] count = new int[201];
        for (int[] arr : lines) {
            for (int i=arr[0]; i<arr[1]; i++) {
                count[i+100]++;
            }
        }
        for (int i : count) {
            if (i>1) answer++;
        }
        return answer;
    }
}