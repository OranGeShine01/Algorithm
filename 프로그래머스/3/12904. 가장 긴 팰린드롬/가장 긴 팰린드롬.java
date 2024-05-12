class Solution
{
    
    public int solution(String s)
    {
        int answer = 0;
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
            // 홀수 펠린드롬
            answer = Math.max(answer, countPalindrome(s, i, i));
            
            // 짝수 펠린드롬
            if (i < len - 1 && s.charAt(i) == s.charAt(i + 1)) {
                answer = Math.max(answer, countPalindrome(s, i, i + 1));
            }
        }
        
        return answer;
    }
    
    private int countPalindrome(String s, int left, int right) {
        int len = s.length();
        int l = left, r = right;
        
        while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }
}