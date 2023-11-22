    import java.io.*;
    import java.util.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());

            long[] arr = new long[n];
            for (int i=0; i<arr.length; i++) {
                arr[i] = Long.parseLong(br.readLine());
            }

            StringBuilder sb = new StringBuilder();

            for (long i : arr) {
                long j = i;
                while(true) {
                    if (pn(j)) {
                        sb.append(j).append('\n');
                        break;
                    }
                    j++;
                }
            }

            bw.append(sb);
            bw.close();
            br.close();
        }

        public static boolean pn(long a) {
            if (a<=1) return false;
            long ra = (long)Math.sqrt(a);
            for (int i=2; i<=ra; i++) {
                if (a%i==0) return false;
            }
            return true;
        }
    }