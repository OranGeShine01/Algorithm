class Solution {
    public boolean solution(int x) {
        if (x%digit(x)==0) {
        	return true;
        } else {
        	return false;
        }
    }
    
    public int digit(int x) {
    	int ans = 0;
    	while (x!=0) {
    		ans+=x%10;
    		x/=10;
    	}
    	return ans;
    }
}