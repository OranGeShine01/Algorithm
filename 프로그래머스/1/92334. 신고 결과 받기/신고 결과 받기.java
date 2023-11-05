import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> map = new HashMap<>();
        Map<String, Queue<String>> report2 = new HashMap<>();
        
        for (int i=0; i<id_list.length; i++) {
            map.put(id_list[i], i);
        }         
        
        for (String str : report) {
            String[] arr = str.split(" ");
            Queue<String> queue = report2.getOrDefault(arr[1], new LinkedList<>());
            if (!queue.contains(arr[0])) queue.add(arr[0]);
            report2.put(arr[1], queue);
        }
        
        for (String str : id_list) {
            Queue<String> queue = report2.getOrDefault(str, new LinkedList<>());
            if (queue.size()>=k) {
                while (!queue.isEmpty()) {
                    answer[map.get(queue.poll())]++;
                }
            }  
        }
        
        return answer;
    }
}