class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if (ineq.equals("<")) answer = (n < m) ? 1 : 0;
        else if (ineq.equals(">")) answer = (n > m) ? 1 : 0; 
        if (eq.equals("=") && n == m) answer = 1;
        return answer;
    }
}