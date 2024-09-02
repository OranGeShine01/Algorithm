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
        int[] count = new int[9];
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == '9') count[6]++;
            else count[ch - '0']++;
        }

        count[6] = count[6] / 2 + count[6] % 2;
        int answer = 0;
        for (int i : count) {
            answer = Math.max(answer, i);
        }

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }


}
