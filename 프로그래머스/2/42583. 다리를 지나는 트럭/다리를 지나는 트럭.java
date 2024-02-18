import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        // bridge weight
        int bw = 0;
        
        Queue<Integer> going = new LinkedList<>();
        
        for (int i : truck_weights) {
            while (true) {
                if (going.size()==bridge_length) {
                    bw-=going.poll();
                }
                if (weight>=bw+i) {
                    going.add(i);
                    answer++;
                    bw+=i;
                    break;
                }
                going.add(0);
                answer++;
            }
        }
        
        return answer+bridge_length;
    }
    
}