import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t > 0) {
            String command = br.readLine();
            int len = Integer.parseInt(br.readLine());

            Deque<Integer> dq = new ArrayDeque<>();
            String[] str = br.readLine().replaceAll("[\\[\\]]", "").split(",");
            if (!str[0].equals("")) {
                for (String s : str) {
                    dq.addLast(Integer.parseInt(s));
                }
            }

            int commandLength = command.length();
            boolean isError = false;
            boolean isReversed = false;

            for (int i = 0; i < commandLength; i++) {
                char ch = command.charAt(i);
                if (ch == 'R') isReversed = !isReversed;
                else if (ch == 'D') {
                    if (dq.isEmpty()) {
                        sb.append("error\n");
                        isError = true;
                        break;
                    } else {
                        if (isReversed) dq.removeLast();
                        else dq.removeFirst();
                    }
                }
            }

            if (!isError) {
                sb.append('[');
                while (!dq.isEmpty()) {
                    if (isReversed) {
                        sb.append(dq.removeLast());
                    } else {
                        sb.append(dq.removeFirst());
                    }
                    if (!dq.isEmpty()) sb.append(',');
                }
                sb.append("]\n");
            }

            t--;
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }
}
