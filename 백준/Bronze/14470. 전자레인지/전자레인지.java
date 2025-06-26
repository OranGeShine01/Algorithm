import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] inputs = new int[5];

        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
        }

        int ans = (inputs[0] < 0) ? Math.abs(inputs[0]) * inputs[2] + inputs[3] + inputs[1] * inputs[4] : (inputs[1] - inputs[0]) * inputs[4];


        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}