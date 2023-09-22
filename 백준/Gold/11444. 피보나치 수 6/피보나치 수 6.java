import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    final static long d = 1000000007;
    final static long[][] arr = {{1, 1}, {1, 0}};

    final static long[][] start = {{1, 0}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long[][] ans = start;
        ans = multi(exp(n-1), arr);
        System.out.println(ans[0][1]);

    }

    public static long[][] exp(long n) {
        if (n<=1) return arr;
        long[][] temp = exp(n/2);
        temp = multi(temp, temp);
        if (n%2==1) temp = multi(temp, arr);
        return temp;
    }

    public static long[][] multi(long[][] a, long[][] b) {
        int r = a.length;
        int c = b[0].length;
        long[][] arr2 = new long[r][c];
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                for (int k=0; k<b.length; k++) {
                    arr2[i][j]+=((a[i][k]%d) * (b[k][j]%d))%d;
                }
                arr2[i][j]%=d;
            }
        }
        return arr2;
    }
}