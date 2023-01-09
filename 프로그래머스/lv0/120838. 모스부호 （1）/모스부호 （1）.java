import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String letter) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map <String, Integer> map = new HashMap<>(); // 모스부호의 순서를 받을 HashMap
        for (int i=0; i<morse.length; i++) {
        	map.put(morse[i], i);
        }
        String[] arr = letter.split(" ");
        for (int i=0; i<arr.length; i++) {
        	sb.append((char)(map.get(arr[i])+97));
        }
        answer = sb.toString();
        return answer;
    }
}