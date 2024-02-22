class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int[] sum = new int[sequence.length+1];
        int gap = Integer.MAX_VALUE;
        for (int i=1; i<sum.length; i++) {
            sum[i] = sum[i-1]+sequence[i-1];
        }
        
        for (int i=0, j=1; i<sum.length; i++) {
            while (j<sum.length) {
                int count = sum[j] - sum[i];
                if (count==k && j-i<gap) {
                    gap = j-i;
                    answer[0] = i;
                    answer[1] = j-1;
                } else if (count<k) {
                    j++;
                    continue;
                }
                break;
            }
        }
        
        return answer;
    }
}