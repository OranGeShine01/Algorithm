import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int len = inputs.length;
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(inputs[i]);
        }

        Arrays.sort(arr);
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < len; i++) {
            answer.append(arr[i]).append(' ');
        }

        bw.append(answer);
        bw.close();
        br.close();
    }
}