import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(br.readLine());
        }

        bw.append(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}