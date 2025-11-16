import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a =  Integer.parseInt(br.readLine());
        int b =  Integer.parseInt(br.readLine());

        int ans = 0;
        if (a > b) {
            ans = 1;
        } else if (a < b) {
            ans = -1;
        }

        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}