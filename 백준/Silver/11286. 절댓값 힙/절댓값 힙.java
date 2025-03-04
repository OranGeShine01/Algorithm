import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
                int result = Math.abs(a) - Math.abs(b);
                if (result != 0) return result;
                else return Integer.compare(a, b);
                }
            );

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                if (pq.isEmpty()) sb.append('0');
                else sb.append(pq.poll());
                sb.append('\n');
            } else {
                pq.add(input);
            }
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }
}
