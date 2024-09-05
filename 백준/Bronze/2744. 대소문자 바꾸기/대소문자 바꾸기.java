import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int len = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append((char)(ch - 32));
            } else sb.append((char)(ch + 32));
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }


}
