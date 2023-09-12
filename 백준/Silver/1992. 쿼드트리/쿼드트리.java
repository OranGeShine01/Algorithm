import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        sb = new StringBuilder();

        for (int i=0; i<n; i++) {
            String str = br.readLine();
            for (int j=0; j<n; j++) {
                arr[i][j] = str.charAt(j)-'0';
            }
        }

        dc(0, 0, n);

        bw.append(sb);
        bw.close();
        br.close();
    }

    public static void dc(int x, int y, int k) {
        int std = arr[x][y];
        for (int i=x; i<x+k; i++) {
            for (int j=y; j<y+k; j++) {
                if (arr[i][j]!=std) {
                    int k2 = k/2;
                    sb.append('(');
                    dc(x, y, k2);
                    dc(x, y+k2, k2);
                    dc(x+k2, y, k2);
                    dc(x+k2, y+k2, k2);
                    sb.append(')');
                    return;

                }
            }
        }
        sb.append(std);
    }


}