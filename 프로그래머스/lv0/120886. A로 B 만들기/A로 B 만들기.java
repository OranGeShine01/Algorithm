class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int[] beforeCount = new int[26];
        int[] afterCount = new int[26];
        int l = before.length();
        
        for (int i=0; i<l; i++) {
        	beforeCount[before.charAt(i)-97]++;
        	afterCount[after.charAt(i)-97]++;
        }
        
        answer = 1;
        
        for (int i=0; i<26; i++) {
        	if (beforeCount[i] != afterCount[i]) {
        		answer = 0;
        		break;
        	}
        }
        
        return answer;
    }
}