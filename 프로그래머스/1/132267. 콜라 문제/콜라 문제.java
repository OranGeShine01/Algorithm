class Solution {
    public int solution(int a, int b, int n) {
        // a : 빈병의 수 b : 바꿔주는 새로운 콜라의 수 n : 초기 콜라의 수
        int answer = 0;
        while(n>=a) {
            int k = n/a*b;
            n = k + n%a;
            answer+=k;
        }
        return answer;
    }
}