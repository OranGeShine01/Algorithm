import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        int sum = Integer.parseInt(inputs[0]);
        int gap = Integer.parseInt(inputs[1]);

        StringBuilder answer = new StringBuilder();

        int plus = sum + gap;
        int minus = sum - gap;
        if (plus % 2 == 0 && minus % 2 == 0 && minus >= 0) answer.append((sum + gap) / 2).append(' ').append((sum - gap) / 2);
        else answer.append(-1);

        bw.append(String.valueOf(answer));
        bw.close();
        br.close();
    }
}