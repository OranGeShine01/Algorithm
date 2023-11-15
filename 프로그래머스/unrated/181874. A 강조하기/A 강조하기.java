class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        char[] arr = myString.toCharArray();
        for (char ch : arr) {
            if (ch=='a') sb.append('A');
            else if (ch>='B' && ch<='Z') sb.append(Character.toLowerCase(ch));
            else sb.append(ch);
        }
        return sb.toString();
    }
}