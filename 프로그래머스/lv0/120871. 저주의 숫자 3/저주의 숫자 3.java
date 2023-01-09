class Solution {
    public int solution(int n) {
    	int answer = 1;
    	int count = 1;
        while (count<=n) {
        	if (!(String.valueOf(answer).contains("3") || (answer%3==0))) {
        		count++;        		
        	}
        	if (count<=n) {
        		answer++;
        	}        	
        }
        return answer;
    }
    
    
}