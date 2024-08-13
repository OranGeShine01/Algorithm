import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int idx = 1;
        StringBuilder sb;
        while (!br.readLine().equals("0")) {
            sb = new StringBuilder("Case ");
            sb.append(idx).append(": Sorting... done!\n");
            bw.append(sb);
            idx++;
        }

        br.close();
        bw.close();
    }
}