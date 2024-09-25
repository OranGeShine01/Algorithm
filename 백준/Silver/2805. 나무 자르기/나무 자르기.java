import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        String[] str = br.readLine().split(" ");
        int[] trees = new int[n];
        int min = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            trees[i] = Integer.parseInt(str[i]);
            if (max < trees[i]) max = trees[i];
        }

        while (min < max) {
            int mid = (min + max) / 2;
            long sum = 0;
            for (int tree : trees) {
                int earning = tree - mid;
                if (earning > 0) sum += earning;
            }

            if (sum < m) max = mid;
            else min = mid + 1;
        }

        bw.append(String.valueOf(min - 1));
        bw.flush();
        bw.close();
        br.close();
    }
}
