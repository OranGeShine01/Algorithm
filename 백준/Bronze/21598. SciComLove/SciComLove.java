import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

        final String str = "SciComLove\n";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.append(str.repeat(n));
        bw.close();
    }
}