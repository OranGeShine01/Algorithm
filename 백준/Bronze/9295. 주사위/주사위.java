import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            String[] inputs = br.readLine().split(" ");
            int sum = 0;
            for (int j = 0; j < inputs.length; j++) {
                sum += Integer.parseInt(inputs[j]);
            }
            answer.append("Case ").append(i).append(": ").append(sum).append('\n');
        }

        bw.append(answer);
        bw.close();
        br.close();
    }
}