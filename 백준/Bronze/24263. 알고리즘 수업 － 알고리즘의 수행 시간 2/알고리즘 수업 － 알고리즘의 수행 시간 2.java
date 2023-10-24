    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            sb.append(n).append('\n').append('1');
            bw.append(sb);
            bw.close();
            br.close();
        }
    }