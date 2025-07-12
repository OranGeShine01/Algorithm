import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        int baseVal = (input - 1) % 8;

        int ans = baseVal <= 4 ? baseVal + 1 : 9 - baseVal;


        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}