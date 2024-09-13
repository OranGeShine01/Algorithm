import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] difficult = new int[n];

        for (int i = 0; i < n; i++) {
            difficult[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(difficult);
        long edge = Math.round(n * 0.15);
        int sum = 0;
        for (int i = (int)edge; i < n - edge; i++) {
            sum += difficult[i];
        }

        long avg = Math.round(sum / (n - edge * 2.0));

        bw.append(String.valueOf(avg));
        bw.flush();
        bw.close();
        br.close();
    }
}
