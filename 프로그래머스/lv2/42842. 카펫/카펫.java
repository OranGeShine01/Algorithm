class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        double sqrt = Math.sqrt(yellow);
        for (int i=1; i<=sqrt; i++) {
            if (yellow%i==0) {
                int j = yellow/i;
                if ((i+2)*(j+2)==(brown+yellow)) {
                    answer[0] = j+2;
                    answer[1] = i+2;
                    break;
                }
            }
        }
        return answer;
    }
}