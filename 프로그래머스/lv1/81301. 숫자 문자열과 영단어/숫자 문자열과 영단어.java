import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(String s) {
        StringBuilder result = new StringBuilder();
        Queue<Character> queue = new LinkedList<>();

        for (int i=0; i<s.length(); i++) {
            queue.add(s.charAt(i));
        }

        while (!queue.isEmpty()) {
            if (queue.peek()>='a' && queue.peek()<='z') {
                if (queue.peek()=='z') {
                    queue.poll();
                    queue.poll();
                    queue.poll();
                    queue.poll();
                    result.append(0);
                }
                else if (queue.peek()=='o') {
                    queue.poll();
                    queue.poll();
                    queue.poll();
                    result.append(1);
                }
                else if (queue.peek()=='t') {
                    queue.poll();
                    if (queue.peek()=='w') {
                        queue.poll();
                        queue.poll();
                        result.append(2);
                    }
                    else if (queue.peek()=='h') {
                        queue.poll();
                        queue.poll();
                        queue.poll();
                        queue.poll();
                        result.append(3);
                    }
                }
                else if (queue.peek()=='f') {
                    queue.poll();
                    if (queue.peek()=='o') {
                        queue.poll();
                        queue.poll();
                        queue.poll();
                        result.append(4);
                    }
                    else if (queue.peek()=='i') {
                        queue.poll();
                        queue.poll();
                        queue.poll();
                        result.append(5);
                    }
                }
                else if (queue.peek()=='s') {
                    queue.poll();
                    if (queue.peek()=='i') {
                        queue.poll();
                        queue.poll();
                        result.append(6);
                    }
                    else if (queue.peek()=='e') {
                        queue.poll();
                        queue.poll();
                        queue.poll();
                        queue.poll();
                        result.append(7);
                    }
                }
                else if (queue.peek()=='e') {
                    queue.poll();
                    queue.poll();
                    queue.poll();
                    queue.poll();
                    queue.poll();
                    result.append(8);
                }
                else if (queue.peek()=='n') {
                    queue.poll();
                    queue.poll();
                    queue.poll();
                    queue.poll();
                    result.append(9);
                }
            }
            else {
                result.append(queue.poll());
            }
        }

        int answer = Integer.parseInt(result.toString());
        return answer;
    }
}