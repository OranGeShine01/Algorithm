import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int r =  Integer.parseInt(br.readLine());
        int g =  Integer.parseInt(br.readLine());
        int b =  Integer.parseInt(br.readLine());

        int ans = r * 3 + g * 4 + b * 5;

        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}