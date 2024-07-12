import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            long l = 0;
            String[] str = br.readLine().split(" ");
            l = Long.parseLong(str[0]) + Long.parseLong(str[1]);
            bw.append(String.valueOf(l));
            bw.append('\n');
        }

        br.close();
        bw.close();
    }
}