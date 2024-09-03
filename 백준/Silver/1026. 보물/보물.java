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

        String[] strA = br.readLine().split(" ");
        String[] strB = br.readLine().split(" ");

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(strA[i]);
            b[i] = Integer.parseInt(strB[i]);
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer += (a[i] * b[n - 1 - i]);
        }

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }


}
