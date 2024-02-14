class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        int l = myString.length();
        for (int i=0; i<l; i++) {
            char ch = myString.charAt(i);
            sb.append((ch=='A') ? 'B' : 'A');
        }
        return (sb.toString().contains(pat) ? 1 : 0);
    }
}