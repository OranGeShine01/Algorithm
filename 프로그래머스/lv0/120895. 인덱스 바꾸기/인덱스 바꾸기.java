class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        char ch1 = my_string.charAt(num1);
        char ch2 = my_string.charAt(num2);
        
        if (num1 < num2) {
            sb.deleteCharAt(num2);
            sb.deleteCharAt(num1);
            sb.insert(num1, ch2);
            sb.insert(num2, ch1);
        } else {
            sb.deleteCharAt(num1);
            sb.deleteCharAt(num2);
            sb.insert(num2, ch1);
            sb.insert(num1, ch2);            
        }
              
        answer = sb.toString();
        return answer;
    }
}