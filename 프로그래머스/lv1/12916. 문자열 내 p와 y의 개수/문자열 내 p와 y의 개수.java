class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        for (int i=0; i<s.length(); i++) {
        	char ch = s.charAt(i);
        	if (ch=='P' || ch=='p') {
        		countP++;
        	} else if (ch=='Y' || ch=='y') {
        		countY++;
        	}
        }
        if (countP!=countY) {
        	answer = false;
        }        

        return answer;
    }
}