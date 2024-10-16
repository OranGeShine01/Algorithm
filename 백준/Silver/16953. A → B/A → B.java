import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static class NodeInfo {
        long value;
        int count;

        public NodeInfo(long value, int count) {
            this.value = value;
            this.count = count;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);

        int answer = bfs(a, b);
        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    static int bfs(int start, int end) {
        Queue<NodeInfo> q = new LinkedList<>();
        q.add(new NodeInfo(start, 1));
        while (!q.isEmpty()) {
            NodeInfo currentNode = q.poll();
            long multipliedTwo = currentNode.value * 2;
            long rightOne = currentNode.value * 10 + 1;
            int nextCount = currentNode.count + 1;
            if (multipliedTwo == end || rightOne == end) return nextCount;
            if (multipliedTwo < end) q.add(new NodeInfo(multipliedTwo, nextCount));
            if (rightOne < end) q.add(new NodeInfo(rightOne, nextCount));
        }
        return -1;
    }
}