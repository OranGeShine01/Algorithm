class Solution {
    public String solution(int q, int r, String code) {
        int len = code.length();
        StringBuilder sb = new StringBuilder();
        for (int i = r; i < len; i += q) {
            sb.append(code.charAt(i));
        }
        return sb.toString();
    }
}