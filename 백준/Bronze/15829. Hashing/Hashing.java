import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {

    public static void main(String[] args) throws Exception {

        final int R = 31;
        final int M = 1234567891;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int r = 1;
        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int hash = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            int a = ch - 'a' + 1;
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
