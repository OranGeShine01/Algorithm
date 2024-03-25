class Solution {
    public int solution(String number) {
        int answer = 0;
        int len = number.length();
        for (int i=0; i<len; i++) {
            answer += number.charAt(i) - '0';
        }
        return answer%9;
    }
}