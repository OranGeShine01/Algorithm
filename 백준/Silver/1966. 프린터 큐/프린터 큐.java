import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            Queue<int[]> q = new LinkedList<>();

            String[] str = br.readLine().split(" ");

            for (int j = 0; j < n; j++) {
                int priority = Integer.parseInt(str[j]);
                q.add(new int[]{j, priority});
                pq.add(priority);
            }

            int index = 0;

            while(!q.isEmpty() && !pq.isEmpty()) {
                int[] current = q.poll();
                if (current[1] == pq.peek()) {
                    pq.poll();
                    if (current[0] == m) {
                        sb.append(index + 1).append('\n');
                        break;
                    }
                    index++;
                } else q.add(current);
            }

            pq.clear();
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }
}
