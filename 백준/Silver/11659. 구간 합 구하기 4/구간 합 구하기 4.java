import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int[] ps = new int[n+1];
        int sum = 0;

        st = new StringTokenizer(br.readLine());

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
            ps[i+1] = sum;
        }

        int[] ans = new int[m];

        for (int k=0; k<m; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            ans[k] = ps[j] - ps[i-1];
            System.out.println(ans[k]);
        }
    }
}