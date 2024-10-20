import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int answer = 0;
        LinkedList<Integer> dq = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            dq.addLast(i);
        }

        String[] str = br.readLine().split(" ");
        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = Integer.parseInt(str[i]);
        }

        for (int target : targets) {
            int index = dq.indexOf(target);
            int mid = dq.size() % 2 == 0 ? (dq.size() - 1) / 2 : dq.size() / 2;
            if (index <= mid) {
                for (int i = 0; i < index; i++) {
                    dq.addLast(dq.pollFirst());
                    answer++;
                }
            } else {
                int reverseIndex = dq.size() - index;
                for (int i = 0; i < reverseIndex; i++) {
                    dq.addFirst(dq.pollLast());
                    answer++;
                }
            }
            dq.pollFirst();
        }

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}