import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 이름-점수를 저장할 map
        Map<String, Integer> map = new HashMap<>();
        int l = name.length;
        for (int i=0; i<l; i++) {
            map.put(name[i], yearning[i]);
        }
        int l2 = photo.length;
        int[] answer = new int[l2];
        for (int i=0; i<l2; i++) {
            int l3 = photo[i].length;
            for (int j=0; j<l3; j++) {
                answer[i] += map.getOrDefault(photo[i][j], 0);
            }
        }
        return answer;
    }
}