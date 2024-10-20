import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int maxValue = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
            maxValue = Math.max(maxValue, arr[i]);
        }

        int min = 0;
        int max = m;

        while (min < max) {
            int mid = (min + max) / 2;
            int sum = 0;
            boolean isOverBudget = false;
            for (int i : arr) {
                sum += Math.min(i, mid);
                if (m < sum) {
                    isOverBudget = true;
                    break;
                }
            }
            if (isOverBudget) max = mid;
            else min = mid + 1;
        }

        bw.append(String.valueOf(Math.min(min - 1, maxValue)));
        bw.flush();
        bw.close();
        br.close();
    }
}