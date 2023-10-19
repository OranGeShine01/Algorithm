    import java.io.*;
    import java.util.StringTokenizer;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());
            int[][] sq = new int[2][2];
            sq[0][0] = Integer.MAX_VALUE;
            sq[0][1] = Integer.MAX_VALUE;
            sq[1][0] = Integer.MIN_VALUE;
            sq[1][1] = Integer.MIN_VALUE;

            for (int i=0; i<n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                sq[0][0] = Math.min(sq[0][0], x);
                sq[0][1] = Math.min(sq[0][1], y);
                sq[1][0] = Math.max(sq[1][0], x);
                sq[1][1] = Math.max(sq[1][1], y);
            }

            bw.append(String.valueOf((sq[1][0]-sq[0][0])*(sq[1][1]-sq[0][1])));
            bw.close();
            br.close();
        }
    }