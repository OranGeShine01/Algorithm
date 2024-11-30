import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        int r1 = Integer.parseInt(inputs[0]);
        int s = Integer.parseInt(inputs[1]);

        int answer = 2 * s - r1;

        bw.append(String.valueOf(answer));
        bw.close();
        br.close();
    }
}