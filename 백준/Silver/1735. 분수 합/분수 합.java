    import java.io.*;
    import java.util.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int[][] arr = new int[2][2];
            for (int i=0; i<arr.length; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j=0; j<arr[i].length; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int gcf = gcf(arr[0][1], arr[1][1]);
            int lcm = arr[0][1] * arr[1][1] / gcf;
            int nume = arr[0][0]*arr[1][1]/gcf + arr[1][0]*arr[0][1]/gcf;

            int gcf2 = gcf(Math.min(nume, lcm), Math.max(nume, lcm));
            if (gcf2!=1) {
                lcm/=gcf2;
                nume/=gcf2;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(nume).append(' ').append(lcm);

            bw.append(sb);
            bw.close();
            br.close();
        }

        public static int gcf(int a, int b) {
            if (b%a==0) return a;
            return gcf(b%a, a);
        }
    }