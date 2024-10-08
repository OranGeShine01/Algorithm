import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(a);

        int ans = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        while (right < n) {
            int current = a[right] - a[left];
            if (current >= m) {
                ans = Math.min(ans, current);
                if (right == left) right++;
                left++;
            } else right++;
        }

        bw.append(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
    }
}