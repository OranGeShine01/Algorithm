class Solution {
    public String solution(int age) {
        String answer = "";
        answer = String.valueOf(age);
        for (int i=0; i<=9; i++) {
            answer = answer.replace((char)(48+i),(char)(97+i));
        }
        return answer;
    }
}