import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n =  Integer.parseInt(br.readLine());
        int ans = 0;
        while (n-- > 0) {
            int d = Integer.parseInt(br.readLine());
            if (d % 2 != 0) ans++;
        }

        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}