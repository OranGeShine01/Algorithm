    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int ans = 0;

            while (true) {
                int input = Integer.parseInt(br.readLine());
                if (input == -1) break;
                ans += input;

            }

            bw.append(String.valueOf(ans));
            bw.close();
            br.close();
        }
    }