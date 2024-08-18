import java.io.*;
import java.util.Arrays;

public class Main {

    static final int K = 3;

    public static void main(String[] args) throws IOException {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] mn = br.readLine().split(" ");
        int n = Integer.parseInt(mn[0]);
        int m = Integer.parseInt(mn[1]);
        int[][] input = new int[n][m];
        int[][] output = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                input[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                output[i][j] = str.charAt(j) - '0';
            }
        }

        int cnt = 0;
        int endM = m - K;
        int endN = n - K;
        for (int i = 0; i <= endN; i++) {
            for (int j = 0; j <= endM; j++) {
                if (input[i][j] != output[i][j]) {
                    reverseArray(input, i, j);
                    cnt++;
                }
            }
        }
        if (!Arrays.deepEquals(input, output)) cnt = -1;
        bw.append(String.valueOf(cnt));
        br.close();
        bw.close();
    }

    private static void reverseArray(int[][] arr, int r, int c) {
        int endR = r + K;
        int endC = c + K;

        for (int i = r; i < endR; i++) {
            for (int j = c; j < endC; j++) {
                arr[i][j] = arr[i][j] == 1 ? 0 : 1;
            }
        }
    }
}