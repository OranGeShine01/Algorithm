import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder answer = new StringBuilder();
        while(true) {
            String[] inputs = br.readLine().split(" ");
            if (inputs[0].equals("#")) break;
            int age = Integer.parseInt(inputs[1]);
            int weight = Integer.parseInt(inputs[2]);
            answer.append(inputs[0]).append(' ').append((age > 17 || weight >= 80) ? "Senior" : "Junior").append('\n');
        }

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
