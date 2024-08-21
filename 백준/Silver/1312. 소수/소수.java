import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int n = Integer.parseInt(str[2]);
        int remainder = a % b;

        while (n > 1) {
            remainder = (remainder * 10) % b;
            n--;
        }

        remainder = remainder * 10 / b;

        bw.append(String.valueOf(remainder));
        bw.close();
        br.close();

    }
}