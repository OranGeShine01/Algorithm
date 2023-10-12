    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = Integer.parseInt(br.readLine());
            int a = 3;
            for (int i=2; i<=n; i++) {
                a=a*2-1;
            }

            bw.append(String.valueOf((int)Math.pow(a, 2)));
            bw.close();
            br.close();
        }
    }