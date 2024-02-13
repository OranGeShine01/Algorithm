class Solution {
    public String solution(String number, int k) {
        String answer = "";
        int l = number.length()-k;
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for (int i=0; i<l; i++) {
            int max = 0;
            for (int j=idx; j<=k+i; j++) {
                int temp = number.charAt(j)-'0';
                if (max<temp) {
                    max = temp;
                    idx = j+1;
                }
            }            
            sb.append(max);
        }
        return sb.toString();
    }
}