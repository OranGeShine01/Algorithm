class Solution {
    public String solution(String polynomial) {
    	
        String[] arr = polynomial.split(" ");
        int x = 0;
        int con = 0;
        for (int i=0; i<=arr.length/2; i++) {
        	String str = arr[2*i];
        	if (str.contains("x")) {
        		if (str.replace("x", "").equals("")) {
        			x+= 1;
        		} else {
        			x+= Integer.parseInt(str.replace("x", ""));
        		}        		
        	} else {
        		con+=Integer.parseInt(str);
        	}
        }
        StringBuilder sb = new StringBuilder();
        if (x==0) {
        	sb.append(con);
        } else if (con==0) {
        	if (x==1) {
        		sb.append("x");
        	} else {
        		sb.append(x).append("x");
        	}        	
        } else {
        	if (x==1) {
        		sb.append("x").append(" + ").append(con);
        	} else {
        		sb.append(x).append("x").append(" + ").append(con);
        	}        	
        }
        String answer = sb.toString();
        
        return answer;
    }
}