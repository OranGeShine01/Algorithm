import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] abc = br.readLine().split(" ");
        int a = Integer.parseInt(abc[0]);
        int b = Integer.parseInt(abc[1]);
        int c = Integer.parseInt(abc[2]);

        bw.append(a + b == c ? "correct!" : "wrong!");
        bw.flush();
        bw.close();
        br.close();
    }
}
