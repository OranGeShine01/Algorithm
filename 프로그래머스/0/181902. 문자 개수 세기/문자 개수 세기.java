class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        int len = my_string.length();
        for (int i = 0; i < len; i++) {
            char ch = my_string.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                answer[my_string.charAt(i) - 'A']++;    
            } else {
                answer[my_string.charAt(i) - 'a' + 26]++;    
            }
            
        }
        return answer;
    }
}