import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        long n = Long.parseLong(br.readLine());
        long m = Long.parseLong(br.readLine());

        bw.append(String.valueOf(n * m));
        bw.close();
    }
}