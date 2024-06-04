class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int len = code.length();
        int mode = 0;
        for (int i = 0; i < len; i++) {
            char ch = code.charAt(i);
            if (ch == '1') {
                mode = (mode == 0) ? 1 : 0;
            } else {
                if (mode == 0 && i % 2 == 0) sb.append(ch);
                else if (mode == 1 && i % 2 == 1) sb.append(ch);
            }
        }
        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }
}