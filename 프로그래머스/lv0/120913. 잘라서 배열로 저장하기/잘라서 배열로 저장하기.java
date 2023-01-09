class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        int l = my_str.length();
        int mod = l%n;
        if (mod==0) {
        	answer = new String[l/n];
        	for (int i=0; i<answer.length; i++) {
        		answer[i] = my_str.substring(i*n, (i+1)*n);
        	}
        }
        else {
        	answer = new String[l/n+1];
        	for (int i=0; i<answer.length-1; i++) {
        		answer[i] = my_str.substring(i*n, (i+1)*n);
        	}
        	answer[answer.length-1] = my_str.substring(l-mod);
        }
        
        
        
        return answer;
    }
}