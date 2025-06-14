import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int ans = 6;

        for (int i = 11; i <= n; i++) {
            ans *= i;
        }


        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}