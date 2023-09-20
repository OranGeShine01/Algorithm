import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        int l = progresses.length;
        for (int i=0; i<l; i++) {
            int temp = 100-progresses[i];
            int release=temp/speeds[i];
            if (temp%speeds[i]!=0) release++;
            queue.add(release);
        }
        List<Integer> list = new ArrayList<>();
        int day = queue.poll();
        int count = 1;
        while (!queue.isEmpty()) {
            System.out.println("day : " + day + " queue.peek() : " + queue.peek());
            if (day>=queue.peek()) {
                count++;
                if (queue.size()==1) list.add(count);
                queue.poll();
            } else {
                list.add(count);
                count = 1;
                if (queue.size()==1) list.add(count);
                day=queue.poll();
            }
        }
        int[] answer = new int[list.size()];
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}