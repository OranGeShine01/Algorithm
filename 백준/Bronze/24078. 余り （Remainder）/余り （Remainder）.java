import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        final int D = 21;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());

        bw.append(String.valueOf(x % D));
        br.close();
        bw.close();
    }
}