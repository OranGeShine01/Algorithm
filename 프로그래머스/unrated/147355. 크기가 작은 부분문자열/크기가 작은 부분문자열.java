class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pl = p.length();
        int tl = t.length();
        for (int i=0; i<=tl-pl; i++) {
            long it = Long.parseLong(t.substring(i, i+pl));
            long ip = Long.parseLong(p);
            if (it<=ip) {
                answer++;
            }
        }
        return answer;
    }
}