import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        Queue<String> queue = new LinkedList<>();
        for (int i=0; i<todo_list.length; i++) {
            if (!finished[i]) queue.add(todo_list[i]);
        }
        String[] answer = new String[queue.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = queue.poll();
        }
        return answer;
    }
}