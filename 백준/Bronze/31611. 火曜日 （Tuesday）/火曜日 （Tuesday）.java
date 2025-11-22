import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x =  Integer.parseInt(br.readLine());

        int ans = x % 7 == 2 ? 1 : 0;

        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}