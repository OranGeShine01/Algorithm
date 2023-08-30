import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] ps = new int[1000];
        int sum = 0;
        long ans = 0;
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum+=arr[i];
            sum%=m;
            ans+= ps[sum];
            ps[sum]++;
            if (sum==0) ans++;
        }

        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}