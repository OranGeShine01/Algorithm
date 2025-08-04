    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringBuilder ans = new StringBuilder();
            int n = Integer.parseInt(br.readLine());

            for (int i = 1; i <= n; i++) {
                ans.append("Hello World, Judge ").append(i).append("!\n");
            }

            bw.append(ans);
            bw.close();
            br.close();
        }
    }