import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] inputs = new String[2][2];
        int[][] values = new int[2][2];

        for (int i = 0; i < 2; i++) {
            inputs[i] = br.readLine().split(" ");
            for (int j = 0; j < inputs[i].length; j++) {
                values[i][j] = Integer.parseInt(inputs[i][j]);
            }
        }

        int answer = Math.min(values[0][0] + values[1][1], values[0][1] + values[1][0]);

        bw.append(String.valueOf(answer));
        bw.close();
        br.close();
    }
}