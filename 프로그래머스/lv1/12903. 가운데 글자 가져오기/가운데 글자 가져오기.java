class Solution {
    public String solution(String s) {
        String answer = "";
        int l = s.length();
        if (l%2==0) {
            answer = s.substring(l/2-1, l/2+1);
        } else {
            answer = String.valueOf(s.charAt(l/2));
        }
        return answer;
    }
}