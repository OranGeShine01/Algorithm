import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ab = br.readLine().split(" ");
        int cost = 2 * Integer.parseInt(br.readLine());
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);

        int sum = a + b;
        int remain = sum - cost;


        bw.append(String.valueOf(remain >= 0 ? remain : sum));
        bw.close();
        br.close();
    }
}