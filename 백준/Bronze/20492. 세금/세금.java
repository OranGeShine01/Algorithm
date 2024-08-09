import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int one = n * 78 / 100;
        int two = n * 4 / 5 + n * 78 / 500;

        bw.append(one + " " + two);
        bw.close();
    }
}