import java.io.*;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        double m = (b - a) / 400.0;

        double ans = 1 / (1 + Math.pow(10, m));

        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}