import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = {};
        int l = emergency.length;
        answer = new int[l];
        Map <Integer, Integer> origin = new HashMap<>(); // emergency의 원래 순서를 저장할 HashMap
        for (int i=0; i<l; i++) {
        	origin.put(emergency[i], i);
        }
        Arrays.sort(emergency); // emergency 정렬
        Map <Integer, Integer> arr = new HashMap<>(); // emergency의 정렬 순서를 저장할 HashMap
        for (int i=0; i<l; i++) {
        	arr.put(emergency[i], l-i);
        }
        for (int i=0; i<l; i++) {
        	answer[origin.get(emergency[i])] = arr.get(emergency[i]);
        }        
        
        return answer;
    }
}