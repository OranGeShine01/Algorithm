import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder answer = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        int sum = n * (n + 1) / 2;

        answer.append(sum).append('\n');
        answer.append(sum * sum).append('\n');

        int sum2 = 0;

        for (int i = 1; i <= n; i++) {
            sum2 += Math.pow(i, 3);
        }

        answer.append(sum2);

        bw.append(answer);
        bw.flush();
        bw.close();
        br.close();

    }
}
