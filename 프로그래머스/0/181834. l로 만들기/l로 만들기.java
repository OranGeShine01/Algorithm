class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        int l = myString.length();
        for (int i=0; i<l; i++) {
            char ch = myString.charAt(i);
            if (ch<'l') sb.append('l');
            else sb.append(ch);
        }
        return sb.toString();
    }
}