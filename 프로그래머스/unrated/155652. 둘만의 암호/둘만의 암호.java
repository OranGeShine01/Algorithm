class Solution {
    public String solution(String s, String skip, int index) {
        int l = s.length();
        int l2 = skip.length();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<l; i++) {
            char ch = s.charAt(i);
            for (int j=0; j<index; j++) {
                ch++;
                if (ch>'z') ch-=26;
                if (skip.indexOf(ch)!=-1) j--;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}