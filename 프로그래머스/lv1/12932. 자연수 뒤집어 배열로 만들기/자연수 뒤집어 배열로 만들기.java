class Solution {
    public int[] solution(long n) {        
        String str = String.valueOf(n);
        int l = str.length();
        int[] answer = new int[l];
        for (int i=0; i<l; i++) {
        	answer[i] = Character.digit(str.charAt(l-i-1), 10);
        }
        return answer;
    }
}