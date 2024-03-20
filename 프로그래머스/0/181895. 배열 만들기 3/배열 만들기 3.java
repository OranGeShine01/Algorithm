class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int len1 = intervals[0][1] - intervals[0][0];
        int len2 = intervals[1][1] - intervals[1][0];
        int[] answer = new int[len1+len2+2];
        for (int i=intervals[0][0]; i<=intervals[0][1]; i++) {
            answer[i-intervals[0][0]] = arr[i];
        }
        
        for (int i=intervals[1][0]; i<=intervals[1][1]; i++) {
            answer[i-intervals[1][0]+len1+1] = arr[i];
        }
        return answer;
    }
}