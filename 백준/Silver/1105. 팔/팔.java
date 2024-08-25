import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        String l = str[0];
        String r = str[1];

        int lenL = l.length();
        int lenR = r.length();
        int count = 0;

        if (lenL != lenR) bw.append("0");
        else {
            for (int i = 0; i < lenL; i++) {
                char chL = l.charAt(i);
                char chR = r.charAt(i);
                if (chL == chR) {
                    if (chL == '8') count++;
                }
                else break;
            }
            bw.append(String.valueOf(count));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
