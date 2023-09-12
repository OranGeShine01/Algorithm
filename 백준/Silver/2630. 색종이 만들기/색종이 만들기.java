import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static int[] count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        count = new int[2];

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        count(0, 0, n);

        bw.append(String.valueOf(count[0])).append("\n").append(String.valueOf(count[1]));
        bw.close();
        br.close();
    }

    public static void count(int x, int y, int n) {
        int color = arr[x][y];
        if (dc(x, y, n)) {
            count[color]++;
            return;
        }
        n/=2;
        count(x, y, n);
        count(x+n, y, n);
        count(x, y+n, n);
        count(x+n, y+n, n);
    }

    public static boolean dc(int x, int y, int n) {

        int std = arr[x][y]; // 기준점

        for (int i=x; i<x+n; i++) {
            for (int j=y; j<y+n; j++) {
                if (arr[i][j]!=std) {
                    return false;
                }
            }
        }

        return true;
    }
}