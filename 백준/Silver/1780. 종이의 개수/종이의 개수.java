import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static int[] count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        count = new int[3];

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        count(0, 0, n);

        for (int i=0; i<3; i++) {
            bw.append(String.valueOf(count[i])).append("\n");
        }
        bw.close();
        br.close();
    }

    public static void count(int x, int y, int k) {
        int std = arr[x][y];
        if (dc(x, y, k)) {
            count[std+1]++;
            return;
        }
        k/=3;
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                count(x+k*i, y+k*j, k);
            }
        }
    }

    public static boolean dc(int x, int y, int k) {
        int std = arr[x][y];
        for (int i=x; i<x+k; i++) {
            for (int j=y; j<y+k; j++) {
                if (arr[i][j]!=std) {
                    return false;
                }
            }
        }
        return true;
    }

}