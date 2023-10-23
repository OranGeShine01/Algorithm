    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringBuilder sb = new StringBuilder();
            sb.append('1').append('\n').append('0');
            bw.append(sb);
            bw.close();
            br.close();
        }
    }