    import java.io.*;
    import java.util.StringTokenizer;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] coe = new int[6];
            for (int i=0; i<coe.length; i++) {
                coe[i] = Integer.parseInt(st.nextToken());
            }

            StringBuilder sb = new StringBuilder();
            for (int i=-999; i<=999; i++) {
                for (int j=-999; j<=999; j++) {
                    if (coe[0]*i+coe[1]*j==coe[2] && coe[3]*i+coe[4]*j==coe[5]) {
                        sb.append(i).append(' ').append(j);
                        bw.append(sb);
                        bw.flush();
                        System.exit(0);
                    }
                }
            }

        }
    }