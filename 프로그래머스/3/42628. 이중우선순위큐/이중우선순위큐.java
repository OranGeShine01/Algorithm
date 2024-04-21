import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (String s : operations) {
            String[] arr = s.split(" ");
            if (arr[0].equals("I")) {
                int val = Integer.parseInt(arr[1]);
                pq.add(val);
                maxPq.add(val);
            } else if (arr[0].equals("D")) {
                if (arr[1].equals("1") && !maxPq.isEmpty()) {
                    int max = maxPq.poll();
                    pq.remove(max);
                } else if (arr[1].equals("-1") && !pq.isEmpty()) {
                    int min = pq.poll();
                    maxPq.remove(min);
                }
            }
        }
        
        if (maxPq.isEmpty()) {
            return new int[]{0, 0};
        }
        
        return new int[]{maxPq.poll(), pq.poll()};
    }
}