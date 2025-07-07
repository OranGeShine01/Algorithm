import java.io.*;

public class Main {



    public static void main(String[] args) throws IOException {

        final double pi = 3.141592;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());

        double ans = d2 * 2 * pi + 2 * d1;


        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}