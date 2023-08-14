class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int l = food.length;
        for (int i=1; i<l; i++) {
            int n = food[i]/2;
            for (int j=0; j<n; j++) {
                sb.append(i);
            }
        }
        String str = sb.toString();
        String rvs = sb.reverse().toString();
        answer = str + "0" + rvs;
        return answer;
    }
}