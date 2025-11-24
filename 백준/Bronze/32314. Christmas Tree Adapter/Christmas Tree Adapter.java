import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a =  Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        int w = Integer.parseInt(inputs[0]);
        int v = Integer.parseInt(inputs[1]);

        char ans = w / v >= a ? '1' : '0';

        bw.append(ans);
        bw.close();
        br.close();
    }
}