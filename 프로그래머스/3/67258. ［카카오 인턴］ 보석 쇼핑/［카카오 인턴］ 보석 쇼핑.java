import java.util.*;

class Solution {
    public int[] solution(String[] gems) {
        int kind = new HashSet<String>(Arrays.asList(gems)).size();
        int len = Integer.MAX_VALUE;
        Map<String, Integer> map = new HashMap<>();
        int start = 0;
        int end = gems.length - 1;
        int[] answer = {};
        
        for (int i = 0; i < gems.length; i++) {
            map.put(gems[i], map.getOrDefault(gems[i], 0) + 1);
            while (map.get(gems[start]) > 1) {
                map.put(gems[start], map.get(gems[start]) - 1);
                start++;
            }
            
            if (kind == map.size() && i >= start && i - start + 1 < len) {
                len = i - start + 1;
                answer = new int[]{start + 1, i + 1};
            }
        }
        return answer;
    }
}