class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuffer sb = new StringBuffer(my_string);
        boolean[] count = new boolean [53]; // 0은 공백, 1~26은 소문자, 27~52는 대문자. 1회이상 등장시 true 반환.
        boolean[] check = new boolean[my_string.length()]; // 문자열 체크, 중복등장한 index에 true 반환.
        for (int i=0; i<my_string.length(); i++) {
        	char ch = my_string.charAt(i);
        	if (ch==' ') {
        		if (count[0]) {
        			check[i] = true;
        		} else {
        			count[0] = true;
        		}
        		
        	} else if (ch>='a') {
        		if (count[ch-96]) {
        			check[i] = true;
        		} else {
        			count[ch-96] = true;
        		}        		
        	} else if (ch<='Z') {
        		if (count[ch-38]) {
        			check[i] = true;
        		} else {
        			count[ch-38] = true;
        		}
        	}
        }
        
        for (int i=check.length-1; i>=0; i--) {
        	if (check[i]) {
        		sb.deleteCharAt(i);
        	}
        }
        answer = sb.toString();
        return answer;
    }
}
