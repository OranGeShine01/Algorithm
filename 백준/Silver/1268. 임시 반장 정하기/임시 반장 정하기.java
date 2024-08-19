import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        final int classNum = 5;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] students = new int[n][classNum];

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < classNum; j++) {
                students[i][j] = Integer.parseInt(str[j]);
            }
        }

        int[] cnt = new int[n];

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = 0; k < classNum; k++) {
                    if (students[i][k] == students[j][k]) {
                        cnt[i]++;
                        cnt[j]++;
                        break;
                    }
                }
            }
        }

        int max = -1;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (max < cnt[i]) {
                max = cnt[i];
                ans = i;
            }
        }

        bw.append(String.valueOf(ans + 1));
        br.close();
        bw.close();
    }
}