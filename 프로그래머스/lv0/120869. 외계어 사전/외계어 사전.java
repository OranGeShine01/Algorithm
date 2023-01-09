class Solution {
    public int solution(String[] spell, String[] dic) {
        // int answer = 2;
        int l1 = spell.length;
        int l2 = dic.length;
        for (int i=0; i<l2; i++) {
        	for (int j=0; j<dic[i].length(); j++) {
        		int count=0;
        		for (int k=0; k<l1; k++) {        			
        			if (dic[i].contains(spell[k])) {
        				count++;
        			} else {
        				break;
        			}        			
        		}
        		if (count==l1) {
    				return 1;
    			}
        	}
        }
        return 2;
    }
}