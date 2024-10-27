import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static class Node {
        int value;
        int time;

        public Node(int value, int time) {
            this.value = value;
            this.time = time;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        int answer = bfs(n, k);

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();

    }

    static int bfs(int n, int k) {

        final int maxValue = 100000;

        boolean[] visited = new boolean[maxValue + 1];
        Deque<Node> dq = new LinkedList<>();
        dq.addFirst(new Node(n, 0));

        while (!dq.isEmpty()) {
            Node currentNode = dq.pollFirst();
            int value = currentNode.value;
            int time = currentNode.time;

            visited[value] = true;
            if (value == k) return time;
            int multipliedValue = value * 2;

            if(multipliedValue <= maxValue && !visited[multipliedValue]) dq.addFirst(new Node(multipliedValue, time));
            if(value + 1 <= maxValue && !visited[value + 1]) dq.addLast(new Node(value + 1, time + 1));
            if(value - 1 >= 0 && !visited[value - 1]) dq.addLast(new Node(value - 1, time + 1));

        }

        return -1;
    }
}
