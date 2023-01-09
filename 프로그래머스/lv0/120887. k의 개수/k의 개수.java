class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char k2 = Character.forDigit(k, 10);
        for (int l=i; l<=j; l++) {
        	String l2 = String.valueOf(l);
        	for (int m=0; m<l2.length(); m++) {
        		if (l2.charAt(m)==k2) {
        			answer++;
        		}
        	}
        }
        return answer;
    }
}