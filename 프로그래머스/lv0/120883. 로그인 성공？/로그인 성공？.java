class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        boolean id = false;
        boolean pw = false;
        int l = db.length;
        for (int i=0; i<l; i++) {
        	if (db[i][0].equals(id_pw[0]) && db[i][1].equals(id_pw[1])) {
        		answer = "login";
        		return answer;
        	} else if (db[i][0].equals(id_pw[0])) {
        		answer = "wrong pw";
                return answer;
        	}
        }
        return answer;
    }
}