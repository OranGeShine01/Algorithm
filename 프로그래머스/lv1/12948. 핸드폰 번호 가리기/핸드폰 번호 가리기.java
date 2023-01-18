class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int l = phone_number.length()-4;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<l; i++) {
            sb.append('*');
        }
        sb.append(phone_number.substring(l));
        answer = sb.toString();
        return answer;
    }
}