class Solution {
    public long solution(int[] sequence) {
        long answer = 0;
        long psPlus = 0;
        long psMinus = 0;
        boolean isEvenIdx = true;
        
        for (int i : sequence) {
            psPlus += isEvenIdx ? i : -i;
            psMinus += isEvenIdx ? -i : i;
            psPlus = Math.max(0, psPlus);
            psMinus = Math.max(0, psMinus);
            answer = Math.max(answer, Math.max(psPlus, psMinus));
            isEvenIdx = !isEvenIdx;
        }        
        return answer;
    }
}