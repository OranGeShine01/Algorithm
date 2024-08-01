import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        final int d = 5;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());

        int ans = (L / d) + ((L % d == 0) ? 0 : 1);

        bw.append(String.valueOf(ans));
        bw.close();
    }
}