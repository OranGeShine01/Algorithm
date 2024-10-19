import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    static class TreeNode {
        char value;
        TreeNode left;
        TreeNode right;

        public TreeNode (char value) {
            this.value = value;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        TreeNode[] nodes = new TreeNode[n];
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            char parent = str[0].charAt(0);
            int parentIndex = parent - 'A';
            if (nodes[parentIndex] == null) {
                nodes[parentIndex] = new TreeNode(parent);
            }

            char left = str[1].charAt(0);
            if (left != '.') {
                int leftIndex = left - 'A';
                nodes[parentIndex].left = new TreeNode(left);
                nodes[leftIndex] = nodes[parentIndex].left;
            }

            char right = str[2].charAt(0);
            if (right != '.') {
                int rightIndex = right - 'A';
                nodes[parentIndex].right = new TreeNode(right);
                nodes[rightIndex] = nodes[parentIndex].right;
            }
        }

        preorderTraversal(nodes[0], answer);
        answer.append('\n');
        inorderTraversal(nodes[0], answer);
        answer.append('\n');
        postorderTraversal(nodes[0], answer);

        bw.append(answer);
        bw.flush();
        bw.close();
        br.close();
    }

    static void preorderTraversal(TreeNode treeNode, StringBuilder sb) {
        if (treeNode == null) return;
        sb.append(treeNode.value);
        preorderTraversal(treeNode.left, sb);
        preorderTraversal(treeNode.right, sb);
    }

    static void inorderTraversal(TreeNode treeNode, StringBuilder sb) {
        if (treeNode == null) return;
        inorderTraversal(treeNode.left, sb);
        sb.append(treeNode.value);
        inorderTraversal(treeNode.right, sb);
    }

    static void postorderTraversal(TreeNode treeNode, StringBuilder sb) {
        if (treeNode == null) return;
        postorderTraversal(treeNode.left, sb);
        postorderTraversal(treeNode.right, sb);
        sb.append(treeNode.value);
    }
}