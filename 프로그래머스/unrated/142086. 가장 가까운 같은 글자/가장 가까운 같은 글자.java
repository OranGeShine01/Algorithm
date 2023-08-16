class Solution {
    public int[] solution(String s) {
        int l = s.length();
        int[] answer = new int[l];
        // 각 알파벳의 가장 가까운 위치를 기록하는 배열
        int[] count = new int[26];
        for (int i=0; i<l; i++) {
            char ch = s.charAt(i);
            int n = ch-97; // 알파벳 순번, a=0, z=25
            if (count[n]==0) {
                answer[i] = -1;
            }
            else {
                answer[i] = i-count[n]+1;
            }
            count[n] = i+1;
        }
        return answer;
    }
}