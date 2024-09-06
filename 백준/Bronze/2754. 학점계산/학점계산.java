import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        float answer = 0;
        char ch0 = str.charAt(0);
        if (ch0 == 'A') answer = 4.0F;
        else if (ch0 == 'B') answer = 3.0F;
        else if (ch0 == 'C') answer = 2.0F;
        else if (ch0 == 'D') answer = 1.0F;

        if (str.length() >= 2) {
            char ch1 = str.charAt(1);
            if (ch1 == '+') answer += 0.3F;
            else if (ch1 == '-') answer -= 0.3F;
        }

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }


}
