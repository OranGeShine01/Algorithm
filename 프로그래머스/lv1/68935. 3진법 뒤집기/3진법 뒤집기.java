class Solution {

    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(tritReverse(n));
        int l = sb.length();
        for (int i=0; i<l; i++) {
            answer+=Character.getNumericValue(sb.charAt(i))*Math.pow(3, l-1-i);
        }
        return answer;
    }

    public String tritReverse(int n) {
        StringBuilder sb = new StringBuilder();
        while (n!=0) {
            sb.append(n%3);
            n/=3;
        }
        return sb.toString();
    }
}