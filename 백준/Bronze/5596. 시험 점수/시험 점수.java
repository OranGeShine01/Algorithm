import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] sum = new int[2];
        for (int i = 0; i < sum.length; i++) {
            String[] inputs = br.readLine().split(" ");
            for (int j = 0; j < inputs.length; j++) {
                sum[i] += Integer.parseInt(inputs[j]);
            }
        }

        int answer = Math.max(sum[0], sum[1]);

        bw.append(String.valueOf(answer));
        bw.close();
        br.close();
    }
}