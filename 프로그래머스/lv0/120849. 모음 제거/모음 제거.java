class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.replace("u", "");
        my_string = my_string.replace("a", "");
        my_string = my_string.replace("e", "");
        my_string = my_string.replace("i", "");
        my_string = my_string.replace("o", "");
        
        answer = my_string;
        
        return answer;
    }
}