import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long sum1 = sum(queue1);
        long sum2 = sum(queue2);
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        for (int i : queue1) {
            q1.add(i);
        }
        
        for (int i : queue2) {
            q2.add(i);
        }
        
        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (sum1==sum2) break;
            else if (sum1>sum2) {
                int temp1 = q1.poll();
                sum1-=temp1;
                q2.add(temp1);
                sum2+=temp1;
            } else {
                int temp2 = q2.poll();
                sum2-=temp2;
                q1.add(temp2);
                sum1+=temp2;
            }
            answer++;
            if (answer>=queue1.length*4) break;
        }
        
        return (sum1==sum2) ? answer : -1;
    }
    
    public long sum (int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}