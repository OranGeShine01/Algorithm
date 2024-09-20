import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {

    public static void main(String[] args) throws Exception {

        final int minLength = 6;
        final int maxLength = 9;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int len = br.readLine().length();
            if (len >= minLength && len <= maxLength) sb.append("yes\n");
            else sb.append("no\n");
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }
}
