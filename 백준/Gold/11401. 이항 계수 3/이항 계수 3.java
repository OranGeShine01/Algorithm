import java.io.*;
import java.util.StringTokenizer;

public class Main {

    final static long d = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        long fn = fact(n);
        long knk = fact(k)*fact(n-k)%d;

        long ans = (fn * exp(knk, d-2))%d;
        bw.append(String.valueOf(ans));

        bw.close();
        br.close();
    }

    public static long exp(long a, long b) {
        if (b==1) {
            return a%d;
        }

        long temp = exp(a, b/2);
        if (b%2==0) {
            return (temp*temp)%d;
        } else {
            return (temp*temp%d)*a%d;
        }
    }

    public static long fact(long k) {
        long temp = 1;
        while (k>1) {
            temp=(temp*k)%d;
            k--;
        }
        return temp;
    }

}