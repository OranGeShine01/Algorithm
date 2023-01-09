class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        for (int i=0; i<babbling.length; i++) {
        	String temp = babbling[i];
        	for (String j : str) {
        		if (temp.contains(j)) {
        			temp = temp.replace(j, "?");
        		}
        	}
        	temp = temp.replace("?", "");
        	if (temp.length()==0) {        		
        		answer++;
        	}
        }
        return answer;
    }
}