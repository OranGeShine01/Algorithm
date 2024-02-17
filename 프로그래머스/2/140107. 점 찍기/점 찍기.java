class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        long dd = (long)d*d;
        for (long i=0; i<=d; i+=k) {
            long x = (long)Math.sqrt(dd-i*i)/k;
            answer+=x+1;
        }
        return answer;
    }
}