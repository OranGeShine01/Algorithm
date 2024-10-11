import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long answer = 1;

        for (int i = 1; i <= n; i++) {
            answer *= i;
        }

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}