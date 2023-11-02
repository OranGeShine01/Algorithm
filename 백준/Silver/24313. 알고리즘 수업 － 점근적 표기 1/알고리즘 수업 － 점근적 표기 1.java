    import java.io.*;
    import java.util.StringTokenizer;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a0 = Integer.parseInt(st.nextToken());
            boolean on = true;
            int c = Integer.parseInt(br.readLine());
            int n0 = Integer.parseInt(br.readLine());

            for (int i=n0; i<=100; i++) {
                if (a1*i+a0>c*i) {
                    on=false;
                    break;
                }
            }

            if (on) bw.append('1');
            else bw.append('0');

            bw.close();
            br.close();
        }
    }