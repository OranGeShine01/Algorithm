import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int ans = 0;

        for (int i = 0; i < 5; i++) {
            ans += Integer.parseInt(br.readLine());
        }

        bw.append(String.valueOf(ans));
        br.close();
        bw.close();
    }
}