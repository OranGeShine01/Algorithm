class Solution {
    public int solution(String s) {
        int answer = 0;
        int fc = 0; // first count
        int dc = 0; // diff count
        char first=' ';
        int l = s.length();
        for (int i=0; i<l; i++) {
            char ch = s.charAt(i);
            if (fc==0) {
                first=ch;
                fc++;
            } else if (fc==dc) {
                answer++;
                fc=0;
                dc=0;
                i--;
            } else if (ch==first) {
                fc++;
            } else {
                dc++;
            }
        }
        if (fc+dc>0) answer++;
        return answer;
    }
}