import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());

        int cnt = 0;
        while (x != 0) {
            x = x & (x - 1);
            cnt++;
        }

        bw.append(String.valueOf(cnt));
        br.close();
        bw.close();
    }
}