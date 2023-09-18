class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left+1)];
        int l = answer.length;
        for (int i=0; i<l; i++) {
            int r = (int)((i+left)/(long)n);
            int c = (i%n+(int)(left%n))%n;
            answer[i] = Math.max(r, c)+1;
        }
        return answer;
    }
}