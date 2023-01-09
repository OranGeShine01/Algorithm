class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] count = new int[26]; // 소문자로 되있는 각 문자의 등장횟수를 count
        for (int i=0; i<s.length(); i++) {
        	char ch = s.charAt(i);
        	count[ch-97]++;
        }
        
        for (int i=0; i<count.length; i++) {
        	if (count[i]==1) {
        		sb.append((char)(i+97));
        	}
        }
        answer = sb.toString();
        return answer;
    }
}