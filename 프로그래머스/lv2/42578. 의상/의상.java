import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        int l = clothes.length;
        for (int i=0; i<l; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
        }
        Collection<Integer> values = map.values();
        for (Integer i : values) {
            answer*=i+1;
        }
        return answer-1;
    }
}