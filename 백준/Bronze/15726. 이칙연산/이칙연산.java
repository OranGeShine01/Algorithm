import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int[] value = new int[input.length];
        for (int i = 0; i < value.length; i++) {
            value[i] = Integer.parseInt(input[i]);
        }

        int answer = (int)Math.max(1.0 * value[0] * value[1] / value[2], 1.0 * value[0] / value[1] * value[2]);


        bw.append(String.valueOf(answer));
        bw.close();
        br.close();
    }
}