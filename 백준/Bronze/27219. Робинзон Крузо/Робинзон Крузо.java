    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int input = Integer.parseInt(br.readLine());
            int v = input / 5;
            int i = input % 5;

            StringBuilder ans = new StringBuilder();

            while (v > 0) {
                ans.append('V');
                v--;
            }

            while (i > 0) {
                ans.append('I');
                i--;
            }

            bw.append(ans);
            bw.close();
            br.close();
        }
    }