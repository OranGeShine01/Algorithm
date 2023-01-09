class Solution {
    public int[] solution(int num, int total) {
        int[] answer = {};
        //num이 홀수인경우 total%num==0, 짝수인경우 total%num!=0
        if (total%num==0) {
        	answer = new int[num];
        	for (int i=0; i<num; i++) {
        		answer[i] = total/num-num/2+i;
        	}
        } else {
        	answer = new int[num];
        	
        	for (int i=0; i<num; i++) {
        		answer[i] = total/num-(num/2-1)+i;
        	}
        }
        return answer;
    }
}