class Solution {
    public String[] solution(String[] picture, int k) {
        int row = picture.length;
        String[] answer = new String[row * k];
        for (int i = 0; i < answer.length; i++) {
            int idx = i / k;
            answer[i] = copy(picture[idx], k);
        }
        return answer;
    }
    
    private String copy(String s, int k) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            for (int j = 0; j < k; j++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}