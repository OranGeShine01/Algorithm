class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        StringBuilder sb = new StringBuilder(s);
        while (!sb.toString().equals("1")) {
            answer[0]++;
            int l = sb.length();
            int l2 = 0;
            for (int i=0; i<l; i++) {
                char ch = sb.charAt(i);
                if (ch=='0') answer[1]++;
                else l2++;
            }
            sb.setLength(0);
            while (l2!=0) {
                sb.append(l2%2);
                l2/=2;
            }
            sb.reverse();
        }

        return answer;
    }
}