class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1+2*(k-1);
        if (answer>numbers.length) {
        	answer%=numbers.length;
        }
        
        return answer;
    }
}