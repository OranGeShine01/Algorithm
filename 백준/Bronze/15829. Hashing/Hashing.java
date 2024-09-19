import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {

    public static void main(String[] args) throws Exception {

        final long R = 31;
        final long M = 1234567891;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long r = 1;
        long len = Long.parseLong(br.readLine());
        String str = br.readLine();
        long hash = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            long a = ch - 'a' + 1;
            hash += a * r;
            hash %= M;
            r *= R;
            r %= M;
        }

        bw.append(String.valueOf(hash));
        bw.flush();
        bw.close();
        br.close();
    }
}
