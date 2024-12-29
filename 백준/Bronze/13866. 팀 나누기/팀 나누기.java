import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int[] values = new int[input.length];
        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(input[i]);
        }
        int answer = Math.abs(values[0] + values[3] - values[1] - values[2]);

        bw.append(String.valueOf(answer));
        bw.close();
        br.close();
    }
}