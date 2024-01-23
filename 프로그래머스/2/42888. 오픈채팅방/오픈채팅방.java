import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        Queue<String> queue = new LinkedList<>();
        for (String str : record) {
            String[] arr = str.split(" ");
            if (arr[0].equals("Change")) map.put(arr[1], arr[2]);
            else if (arr[0].equals("Enter")) {
                if (!map.containsKey(arr[1]) || !arr[2].equals(map.get(arr[1]))) map.put(arr[1], arr[2]);
                queue.add(arr[1] + "?님이 들어왔습니다.");
            } else if (arr[0].equals("Leave")) {
                queue.add(arr[1] + "?님이 나갔습니다.");
            }
        }                
                
        String[] answer = new String[queue.size()];
        for (int i=0; i<answer.length; i++) {
            String[] arr = queue.poll().split("\\?");
            answer[i] = map.get(arr[0]) + arr[1];
        }
        return answer;
    }
}