class Solution {
    public long solution(long n) {
        long answer = -1;
        if (n==Math.pow(Math.ceil(Math.sqrt(n)),2)) {
        	answer = (long) Math.pow(Math.ceil(Math.sqrt(n))+1, 2);
        }
        return answer;
    }
}