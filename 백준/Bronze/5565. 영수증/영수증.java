import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int ans = Integer.parseInt(br.readLine());

        int cnt = 9;

        while (cnt > 0) {
            ans -= Integer.parseInt(br.readLine());
            cnt--;
        }

        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}