class Solution {
    
    final int americano = 4500;
    final int cafelatte = 5000;
    
    public int solution(String[] order) {
        int answer = 0;
        for (String s : order) {
            if (s.contains("americano") || s.contains("anything")) answer += americano;
            else if (s.contains("cafelatte")) answer += cafelatte;
        }
        return answer;
    }
}