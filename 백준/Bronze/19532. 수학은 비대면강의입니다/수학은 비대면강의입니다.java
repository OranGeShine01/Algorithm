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
            int bdae = coe[1]*coe[3]-coe[0]*coe[4];
            int x = (coe[1]*coe[5]-coe[2]*coe[4])/bdae;
            int y = (coe[2]*coe[3]-coe[0]*coe[5])/bdae;
            sb.append(x).append(' ').append(y);
            bw.append(sb);

            bw.close();
            br.close();
        }
    }