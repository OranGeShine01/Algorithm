class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        int n = c - 1;
        int len = my_string.length();
        for (int i=n; i<len; i += m) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}