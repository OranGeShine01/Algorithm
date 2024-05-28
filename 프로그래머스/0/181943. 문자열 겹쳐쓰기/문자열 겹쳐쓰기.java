class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(0, s)).append(overwrite_string);
        int len = sb.length();
        sb.append(my_string.substring(len));
        return sb.toString();
    }
}