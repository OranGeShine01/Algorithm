class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
        	if (prime(n)[i]) {
        		answer++;
        	}
        }
        return answer;
    }
    
    // 에라토스테네스의 체, 소수가 아니면 true를 반환.
    public boolean[] prime(int n) {
    	boolean[] pn = new boolean[n+1];
    	
    	for (int i=2; i<n+1; i++) {
    			if (pn[i]) {
    				continue;
    			} else {
    				for (int j=i*i; j<=n; j+=i) {
    						pn[j] = true;
    				}
    			}
    	}
    	return pn;
    }
}