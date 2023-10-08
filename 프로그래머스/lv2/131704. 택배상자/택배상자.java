import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int l = order.length;
        Stack<Integer> sub = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i<=l; i++) {
            queue.add(i);
        }
        for (int i : order) {
            while(!queue.isEmpty() || !sub.isEmpty()) {
                if (!queue.isEmpty()) {
                    int box = queue.peek();
                    if (box==i) {
                        answer++;
                        queue.poll();
                        break;
                    } else {
                        if (!sub.isEmpty() && sub.peek()==i) {
                            sub.pop();
                            answer++;
                            break;
                        } else {
                            sub.push(box);
                            queue.poll();
                        }
                    }
                } else {
                    if (sub.peek()==i) {
                        sub.pop();
                        answer++;
                        break;
                    } else return answer;
                }
            }
        }
        return answer;
    }
}