    import java.io.*;
    import java.util.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());

            long[] ab = new long[2];
            for (int i=0; i<ab.length; i++) {
                ab[i] = Long.parseLong(st.nextToken());
            }

            Arrays.sort(ab);

            bw.append(String.valueOf((ab[0]*ab[1])/lcd(ab[0], ab[1])));

            bw.close();
            br.close();
        }

        public static long lcd(long a, long b) {
            if (b%a==0) return a;
            return lcd(b%a, a);
        }
    }