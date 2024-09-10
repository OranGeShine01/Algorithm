import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int AB = Integer.parseInt(String.valueOf(A) + B);

        StringBuilder sb = new StringBuilder();
        sb.append(A + B - C).append('\n').append(AB - C);
        bw.append(sb);

        bw.flush();
        bw.close();
        br.close();
    }
}
