import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = i+1;
        }
        for (int k=0; k<m; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            for (int l=i-1; l<(j+i)/2; l++) {
                int temp = arr[l];
                int ij = i+j-2-l;
                arr[l] = arr[ij];
                arr[ij] = temp;
            }
        }

        for (int i : arr) {
            bw.append(i + " ");
        }
        bw.close();
        br.close();
    }
}