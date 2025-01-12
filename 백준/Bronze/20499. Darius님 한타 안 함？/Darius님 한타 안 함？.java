import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split("/");

        int k = Integer.parseInt(inputs[0]);
        int d = Integer.parseInt(inputs[1]);
        int a = Integer.parseInt(inputs[2]);

        String answer = (k + a) >= d && d != 0 ? "gosu" : "hasu";

        bw.append(answer);
        bw.close();
        br.close();
    }
}