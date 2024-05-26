import java.util.*;

class Solution {
    public String solution(int n, int k, String[] cmd) {
        String answer = "";
        // 이전 노드
        int[] prev = new int[n];
        // 다음 노드
        int[] next = new int[n];
        // 삭제된 노드를 담을 stack
        Deque<Node> stack = new ArrayDeque<>();
        
        // 초기화
        for (int i = 0; i < n; i++) {
            prev[i] = i - 1;
            next[i] = i + 1;
        }
        
        next[n - 1] = -1;
        
        StringBuilder sb = new StringBuilder("O".repeat(n));
        
        for (int i = 0; i < cmd.length; i++) {
            char ch = cmd[i].charAt(0);
            if (ch == 'U') {
                int num = Integer.parseInt(cmd[i].substring(2));
                while (num-- > 0) {
                    k = prev[k];
                }
            } else if (ch =='D') {
                int num = Integer.parseInt(cmd[i].substring(2));
                while (num-- > 0) {
                    k = next[k];
                }
            } else if (ch == 'C') {
                stack.push(new Node(prev[k], k, next[k]));
                if (prev[k] != -1) next[prev[k]] = next[k];
                if (next[k] != -1) prev[next[k]] = prev[k];
                sb.setCharAt(k, 'X');
                if (next[k] != -1) k = next[k];
                else k = prev[k];
            } else if (ch == 'Z') {
                Node node = stack.pop();
                if (prev[node.cur] != -1) next[node.prev] = node.cur;
                if (next[node.cur] != -1) prev[node.next] = node.cur;
                sb.setCharAt(node.cur, 'O');
            }
        }
        return sb.toString();
    }
    
    public class Node {
        int prev;
        int cur;
        int next;
        
        public Node (int prev, int cur, int next) {
            this.prev = prev;
            this.cur = cur;
            this.next = next;
        }
    }
}