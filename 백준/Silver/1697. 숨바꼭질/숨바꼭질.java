import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws Exception {

        final int MAX_VALUE = 100000;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        int[] times = new int[MAX_VALUE + 1];
        Queue<Integer> q = new LinkedList<>();

        times[n] = 1;
        q.add(n);

        while (!q.isEmpty()) {
            int current = q.poll();
            int front = current - 1;
            if (current > 0 && times[front] == 0) {
                q.add(front);
                times[front] = times[current] + 1;
            }
            int back = current + 1;
            if (back <= MAX_VALUE && times[back] == 0) {
                q.add(back);
                times[back] = times[current] + 1;
            }
            int teleport = current * 2;
            if (teleport <= MAX_VALUE && times[teleport] == 0) {
                q.add(teleport);
                times[teleport] = times[current] + 1;
            }

            if (times[k] != 0) break;
        }

        bw.append(String.valueOf(times[k] - 1));
        bw.flush();
        bw.close();
        br.close();
    }
}
