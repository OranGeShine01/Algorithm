import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        bw.append(String.valueOf(exp(a, b, c)));

        bw.close();
        br.close();
    }

    public static long exp(int a, int b, int c) {
        if (b==1) {
            return a%c;
        }

        long temp = exp(a, b/2, c);
        if (b%2==0) {
            return (temp*temp)%c;
        } else {
            return (temp*temp%c)*a%c;
        }
    }
}