import java.io.*;
import java.util.StringTokenizer;

public class Main {

    final static int d = 1000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken())%d;
            }
        }

        int[][] ans = exp(arr, b);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                sb.append(ans[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
        br.close();
    }

    public static int[][] exp(int[][] arr, long e) {
        if (e==1) return arr;
        else {
            int[][] temp = exp(arr, e/2);
            temp = multi(temp, temp);
            if (e%2==1) {
                temp = multi(temp, arr);
            }
            return temp;
        }
    }

    public static int[][] multi(int[][] arr1, int[][] arr2) {
        int l = arr1.length;
        int[][] arr3 = new int[l][l];
        for (int i=0; i<l; i++) {
            for (int j=0; j<l; j++) {
                for (int k=0; k<l; k++) {
                    arr3[i][j]+=arr1[i][k]*arr2[k][j];
                    arr3[i][j]%=d;
                }
            }
        }
        return arr3;
    }



}