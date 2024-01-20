import java.util.*;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> map = new HashMap<>();
        Queue<Character> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        for (int i=0; i<26; i++) {
            map.put(String.valueOf((char)('A'+i)), i+1);
        }

        int l = msg.length();
        for (int i=0; i<l; i++) {
            queue1.add(msg.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        while (!queue1.isEmpty() || sb.length()!=0) {
            if (!queue1.isEmpty()) sb.append(queue1.peek());
            else {
                queue2.add(map.get(sb.toString()));
                break;
            }
            if (map.containsKey(sb.toString())) {
                queue1.poll();
                continue;
            } else {
                queue2.add(map.get(sb.substring(0, sb.length()-1)));
                map.put(sb.toString(), map.size()+1);
                sb.setLength(0);
            }
        }

        int[] answer = new int[queue2.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = queue2.poll();
        }
        return answer;
    }
}