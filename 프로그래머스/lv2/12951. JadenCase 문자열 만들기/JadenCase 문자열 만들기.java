class Solution {
    public String solution(String s) {
        boolean start = true; // 첫문자여부 판단
        int l = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<l; i++) {
            char ch = s.charAt(i);
            if (start && ch!=' ') {
                sb.append(Character.toUpperCase(ch));
                start = false;
            } else if (ch==' ') {
                start = true;
                sb.append(ch);
            } else {
                sb.append(Character.toLowerCase(ch));
            }
        }
        return sb.toString();
    }
}