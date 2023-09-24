import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[k];
        long end = 0;
        for (int i=0; i<k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            end = Math.max(end, arr[i]);
        }

        end++;
        long start = 0;
        long mid = 0;

        while (start<end) {
            long count = 0;
            mid = (start+end)/2;
            for (int i : arr) {
                count+=(i/mid);
            }
            if (count>=n) start = mid+1;
            else end = mid;
        }

        System.out.println(start-1);

    }


}