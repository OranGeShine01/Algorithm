import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char ch = br.readLine().charAt(0);

        int ans = ch - 44031;

        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}