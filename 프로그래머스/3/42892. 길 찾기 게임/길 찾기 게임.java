import java.util.*;

class Solution {
    
    int idx = 0;
    int[][] answer;
    
    class Node {
        int val;
        int x;
        int y;
        Node left;
        Node right;
        
        public Node (int val, int x, int y, Node left, Node right) {
            this.val = val;
            this.x = x;
            this.y = y;
            this.left = left;
            this.right = right;
        }        
    }
    
    public int[][] solution(int[][] nodeinfo) {
        
        int len = nodeinfo.length;
        answer = new int[2][len];
        Node[] nodes = new Node[len];
        
        // 각 node 삽입
        for (int i = 0; i < len; i++) {
            nodes[i] = new Node(i + 1, nodeinfo[i][0], nodeinfo[i][1], null, null);
        }
        
        // 정렬 (y축 내림차순, x축 오름차순)
        Arrays.sort(nodes, (node1, node2) -> 
                    (node1.y == node2.y) ? node1.x - node2.x : node2.y - node1.y
                   );
        
        Node parent = nodes[0];
        
        // 부모자식 노드 연결
        for (int i = 1; i < len; i++) {
            insertTree(parent, nodes[i]);
        }
        
        // 전위 순회
        preOrder(parent);
        
        idx = 0;
        
        // 후위순회
        reverseOrder(parent);
        
        return answer;
    }
    
    // 부모자식 노드 연결 매서드
    private void insertTree(Node parent, Node node) {
        if (parent.x > node.x) {
            if (parent.left == null) parent.left = node;
            else insertTree(parent.left, node);
        } else {
            if (parent.right == null) parent.right = node;
            else insertTree(parent.right, node);
        }
    }
    
    // 전위 순회
    private void preOrder(Node node) {
        if (node != null) {
            answer[0][idx++] = node.val;
            preOrder(node.left);
            preOrder(node.right);    
        }
    }
    
    // 후위 순회
    private void reverseOrder(Node node) {
        if (node != null) {
            reverseOrder(node.left);
            reverseOrder(node.right);
            answer[1][idx++] = node.val;
        }
        
    }
}