import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final String[] univs = {"Soongsil", "Korea", "Hanyang"};

        String[] inputs = br.readLine().split(" ");
        int[] values = new int[inputs.length];

        int sum = 0;
        int minIdx = 0;
        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(inputs[i]);
            sum += values[i];
            if (minVal > values[i]) {
                minIdx = i;
                minVal = values[i];
            }
        }

        bw.append(sum >= 100 ? "OK" : univs[minIdx]);
        bw.close();
        br.close();
    }
}