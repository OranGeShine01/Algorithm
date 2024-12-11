import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        final int INPUT_LINE = 4;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        for (int i = 0; i < INPUT_LINE; i++) {
            int input = Integer.parseInt(br.readLine());
            sum += input;
        }

        StringBuilder answer = new StringBuilder();

        answer.append(sum / 60).append('\n').append(sum % 60);


        bw.append(answer);
        bw.close();
        br.close();
    }
}