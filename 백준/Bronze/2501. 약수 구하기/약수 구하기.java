    import java.io.*;
    import java.util.StringTokenizer;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int count = 0;
            for (int i=1; i<=n; i++) {
                if (n%i==0) {
                    count++;
                    if (count==k) {
                        bw.append(String.valueOf(i));
                        bw.flush();
                        System.exit(0);
                    }
                }
            }

            bw.append('0');
            bw.close();
            br.close();
        }
    }