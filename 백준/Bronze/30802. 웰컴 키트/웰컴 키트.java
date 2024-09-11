import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] memberOfSize = br.readLine().split(" ");
        String[] tp = br.readLine().split(" ");

        int t = Integer.parseInt(tp[0]);
        int p = Integer.parseInt(tp[1]);

        int sum = 0;
        for (int i = 0; i < memberOfSize.length; i++) {
            int members = Integer.parseInt(memberOfSize[i]);
            if (members != 0) sum += (members - 1) / t + 1;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sum).append('\n').append(n / p).append(' ').append(n % p);
        bw.append(sb);

        bw.flush();
        bw.close();
        br.close();
    }
}
