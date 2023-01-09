class Solution {
    public String solution(String bin1, String bin2) {
        String answer = dectobin(bintodec(bin1) + bintodec(bin2));
        return answer;
    }
    
    public int bintodec(String bin) {
    	int l = bin.length();
    	int result = 0;
    	for (int i=0; i<l; i++) {
    		int k = (bin.charAt(i)-48);
    		result+=k*Math.pow(2, l-1-i);
    	}
    	return result;
    }
    
    public String dectobin(int k) {
    	StringBuilder sb = new StringBuilder();
    	if (k==0) {
    		return "0";
    	} else {
    		while (k!=0) {
        		sb.append(String.valueOf(k%2));
        		k/=2;
        	}
        	return sb.reverse().toString();
    	}    	
    }
}