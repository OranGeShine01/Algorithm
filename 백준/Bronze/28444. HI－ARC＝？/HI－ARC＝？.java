import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int h = Integer.parseInt(str[0]);
        int i = Integer.parseInt(str[1]);
        int a = Integer.parseInt(str[2]);
        int r = Integer.parseInt(str[3]);
        int k = Integer.parseInt(str[4]);

        bw.append(String.valueOf(h * i - a * r * k));
        bw.flush();
        bw.close();
        br.close();

    }
}
