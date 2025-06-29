import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        int s = Integer.parseInt(inputs[0]);
        int t = Integer.parseInt(inputs[1]);
        int d = Integer.parseInt(inputs[2]);

        int ans = d / (2 * s) * t;

        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}