import java.util.*;

class Solution {
    
    final int stringColumn = 4;
    
    Map<String, ArrayList<Integer>> map;
    
    public int[] solution(String[] info, String[] query) {
        
        int[] answer = new int[query.length];
        map = new HashMap<>();
        
        for (String s : info) {
            String[] infoOne = s.split(" ");
            saveInfo (0, "", infoOne);
        }
        
        for (String key : map.keySet()) {
            Collections.sort(map.get(key));
        }
        
        for (int i=0; i<query.length; i++) {
            query[i] = query[i].replaceAll(" and ", "");
            String[] q = query[i].split(" ");
            answer[i] = map.containsKey(q[0]) ? 
                binarySearch(q[0], Integer.parseInt(q[1])) : 0;
        }
        
        return answer;
    }
    
    void saveInfo(int depth, String str, String[] infoOne) {
        if (depth == stringColumn) {
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList<Integer>());
            }
            map.get(str).add(Integer.parseInt(infoOne[stringColumn]));
            return;
        }
        saveInfo(depth+1, str + "-", infoOne);
        saveInfo(depth+1, str + infoOne[depth], infoOne);
    }
        
    int binarySearch(String key, int score) {
        ArrayList<Integer> list = map.get(key);
        int start = 0;
        int end = list.size() - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (list.get(mid) < score) start = mid + 1;
            else end = mid - 1;
        }
        
        return list.size() - start;
    }
}