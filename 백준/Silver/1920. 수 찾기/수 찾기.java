import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] a;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] x = new int[m];
        for (int i=0; i<m; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();

        for (int i : x) {
            sb.append(bs(i)).append('\n');
        }

        System.out.println(sb);

    }

    //array에서 n값을 찾는 BinarySearch
    public static int bs(int n) {
        int end = a.length-1;
        int start = 0;
        //int count = 0;
        while (start<=end) {
            int mid = (start+end)/2;
            if (a[mid]==n) {
                return 1;
            }
            else if (a[mid]>n) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return 0;
    }


}