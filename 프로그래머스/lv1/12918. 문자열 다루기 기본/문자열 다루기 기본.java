class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int l = s.length();
        if (!(l==6 || l==4)) {
            return false;
        } else {
            for (int i=0; i<l; i++) {
                char ch = s.charAt(i);
                if (ch<'0' || ch>'9') {
                    return false;
                }
            }
        }
        return answer;
    }
}