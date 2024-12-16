import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder answer = new StringBuilder();

        while(true) {
            String input = br.readLine();
            if (input.equals("0 0")) break;
            String[] inputs = input.split(" ");

            int sum = 0;

            for (int i = 0; i < inputs.length; i++) {
                sum += Integer.parseInt(inputs[i]);
            }

            answer.append(sum).append('\n');
        }

        bw.append(answer);
        bw.close();
        br.close();
    }
}