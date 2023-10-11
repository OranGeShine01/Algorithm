    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int t = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            int[] coin = {25, 10, 5, 1};
            for (int i=0; i<t; i++) {
                int c = Integer.parseInt(br.readLine());
                for (int j : coin) {
                    sb.append(c/j).append(' ');
                    c%=j;
                }
                sb.append('\n');
            }

            bw.append(sb);
            bw.close();
            br.close();
        }
    }