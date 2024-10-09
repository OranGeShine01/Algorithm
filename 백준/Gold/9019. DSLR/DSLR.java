import org.w3c.dom.Node;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static class NodeInfo {
        int value;
        StringBuilder commands;
        public NodeInfo(int value, StringBuilder commands) {
            this.value = value;
            this.commands = commands;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String[] inputs = br.readLine().split(" ");
            int start = Integer.parseInt(inputs[0]);
            int target = Integer.parseInt(inputs[1]);
            answer.append(bfs(start, target)).append('\n');
        }

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    static StringBuilder bfs(int start, int target) {

        Queue<NodeInfo> q = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        boolean[] visited = new boolean[10000];
        q.add(new NodeInfo(start, new StringBuilder()));
        visited[start] = true;

        while (!q.isEmpty()) {
            NodeInfo currentNode = q.poll();

            for (char command : new char[]{'D', 'S', 'L', 'R'}) {
                StringBuilder newCommands = new StringBuilder();
                newCommands.append(currentNode.commands).append(command);
                int newValue = executeCommand(currentNode.value, command);

                if (!visited[newValue]) {
                    visited[newValue] = true;
                    if (newValue == target) {
                        return newCommands;
                    }
                    q.add(new NodeInfo(newValue, newCommands));
                }
            }
        }

        return result;
    }

    static int executeCommand(int value, char command) {
        int result = 0;

        switch (command) {
            case 'D':
                result = (2 * value) % 10000;
                break;
            case 'S':
                result = (value == 0) ? 9999 : value - 1;
                break;
            case 'L':
                result = (value % 1000) * 10 + value / 1000;
                break;
            case 'R':
                result = (value % 10) * 1000 + value / 10;
                break;
        }

        return result;
    }
}