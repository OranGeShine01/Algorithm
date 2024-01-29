import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Map<Integer, Integer> time = new HashMap<>();
        
        for (String str : records) {
            String[] arr = str.split(" ");
            String[] arr2 = arr[0].split(":");
            int t = 60*Integer.parseInt(arr2[0]) + Integer.parseInt(arr2[1]);
            int num = Integer.parseInt(arr[1]);
            if (arr[2].equals("IN")) {
                time.put(num, t);
            } else if (arr[2].equals("OUT")) {
                map.put(num, map.getOrDefault(num, 0)+t-time.get(num));
                time.remove(num);
            }
        }
        
        for (Integer key : time.keySet()) {
            map.put(key, map.getOrDefault(key, 0)+1439-time.get(key));
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (Integer key : map.keySet()) {
            int v = Math.max(map.get(key)-fees[0], 0);
            list.add(fees[1]+((v%fees[2]==0) ? v/fees[2] : v/fees[2]+1)*fees[3]);
        }
                
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}