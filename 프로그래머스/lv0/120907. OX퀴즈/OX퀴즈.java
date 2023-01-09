class Solution {
    public String[] solution(String[] quiz) {        
        int l = quiz.length;
        String[] answer = new String[l];
        for (int i=0; i<l; i++) {
        	String[] str = quiz[i].split(" ");
        	int[] num = {Integer.parseInt(str[0]), Integer.parseInt(str[2])};
        	int oper=0;
        	if (str[1].equals("-")) {
        		oper = num[0] - num[1];
        	} else if (str[1].equals("+")) {
        		oper = num[0] + num[1];
        	}
        	if (oper==Integer.parseInt(str[4])) {
        		answer[i] = "O";
        	} else {
        		answer[i] = "X";
        	}
        }
        
        return answer;
    }
}