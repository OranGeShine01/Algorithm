import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        String[] c = br.readLine().split(" ");
        Queue<String> q = new LinkedList<>();

        for (int i = n - 1; i >= 0; i--) {
            if (a[i].equals("0")) q.add(b[i]);
        }

        for (String s : c) {
            q.add(s);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            sb.append(q.poll()).append(" ");
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }
}