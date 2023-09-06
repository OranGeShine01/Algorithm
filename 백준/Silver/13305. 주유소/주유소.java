import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] load = new int[n-1];
        for (int i=0; i<n-1; i++) {
            load[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int min = Integer.MAX_VALUE;
        BigInteger ans = new BigInteger("0");
        for (int i=0; i<n-1; i++) {
            min = Math.min(min, Integer.parseInt(st.nextToken()));
            ans = ans.add(BigInteger.valueOf(min).multiply(BigInteger.valueOf(load[i])));
        }

        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}