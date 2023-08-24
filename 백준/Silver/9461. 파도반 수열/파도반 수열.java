import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static long[] p = new long[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        p[1] = 1;
        p[2] = 1;
        p[3] = 1;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(p(n)).append('\n');
        }
        System.out.println(sb);
    }

    static long p(int n) {
        if (p[n]!=0) {
            return p[n];
        } else {
            return p[n] = p(n-2) + p(n-3);
        }
    }
}

