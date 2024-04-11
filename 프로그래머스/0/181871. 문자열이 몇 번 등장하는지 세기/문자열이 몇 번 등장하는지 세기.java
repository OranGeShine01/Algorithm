class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int len = myString.length();
        int patLen = pat.length();
        for (int i=0; i+patLen<=len; i++) {
            if (myString.substring(i, i+patLen).equals(pat)) answer++;
        }
        return answer;
    }
}