    import java.io.*;
    import java.util.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[n];
            for (int i=0; i<arr.length; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(arr);

            int[] dArr = new int[n-1];

            for (int i=0; i<dArr.length; i++) {
                dArr[i] = arr[i+1] - arr[i];
            }

            Arrays.sort(dArr);
            int l = dArr.length-1;
            int gcd = 1;

            for (int i=0; i<l; i++) {
                if (i==0) gcd = gcd(dArr[i], dArr[i+1]);
                else gcd = gcd(gcd, dArr[i+1]);
            }

            int ans = 0;
            for (int i : dArr) {
                ans+=i/gcd-1;
            }

            bw.append(String.valueOf(ans));
            bw.close();
            br.close();
        }

        public static int gcd(int a, int b) {
            if (b%a==0) return a;
            return gcd(b%a, a);
        }
    }