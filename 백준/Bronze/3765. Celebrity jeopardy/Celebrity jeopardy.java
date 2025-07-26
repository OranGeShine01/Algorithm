    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringBuilder ans = new StringBuilder();
            String input;

            while ((input = br.readLine()) != null) {
                ans.append(input).append('\n');
            }

            bw.append(ans);
            bw.close();
            br.close();
        }
    }