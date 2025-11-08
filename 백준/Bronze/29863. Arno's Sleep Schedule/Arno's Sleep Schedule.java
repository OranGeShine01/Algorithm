import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());

        int ans = end - start;
        if (ans < 0) ans += 24;

        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}