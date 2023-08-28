import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        // 제시된 온도를 받을 배열
        int[] temp = new int[n];
        st = new StringTokenizer(br.readLine());

        // 누적합
        int[] ps = new int[n+1];
        int sum = 0;

        for (int i=0; i<n; i++) {
            temp[i] = Integer.parseInt(st.nextToken());
            sum += temp[i];
            ps[i+1] = sum;
        }

        int max = Integer.MIN_VALUE;
        int l = n-k+1;
        for (int i=0; i<l; i++) {
            max = Math.max(max, ps[i+k] - ps[i]);
        }

        System.out.println(max);
    }
}