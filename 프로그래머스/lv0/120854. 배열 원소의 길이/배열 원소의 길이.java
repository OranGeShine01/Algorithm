class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        int l = strlist.length;
        answer = new int[l];
        for (int i=0; i<l; i++) {
            answer[i] = strlist[i].length();
        }
            
        return answer;
    }
}