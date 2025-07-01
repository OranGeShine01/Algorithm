import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int ans = 0;

        if (input % 10 == 0) {
            ans = input / 100 + input % 100;
        } else {
            ans = input / 10 + input % 10;
        }

        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}