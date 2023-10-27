    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            long n = Long.parseLong(br.readLine());
            StringBuilder sb = new StringBuilder();
            sb.append((n*n*n)).append('\n').append('3');
            bw.append(sb);
            bw.close();
            br.close();
        }
    }