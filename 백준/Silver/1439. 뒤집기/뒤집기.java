import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int len = s.length();
        int count = 1;
        for (int i = 1; i < len; i++) {
            char ch = s.charAt(i);
            char prevCh = s.charAt(i - 1);
            if (ch != prevCh) count++;
        }

        bw.append(String.valueOf(count/2));
        bw.flush();
        bw.close();
        br.close();
    }
}
