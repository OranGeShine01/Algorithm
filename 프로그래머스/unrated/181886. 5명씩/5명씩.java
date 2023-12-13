class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[names.length/5 + ((names.length%5 == 0) ? 0 : 1)];
        int i = 0;
        while (i*5<names.length) {
            answer[i] = names[i*5];
            i++;
        }
        return answer;
    }
}