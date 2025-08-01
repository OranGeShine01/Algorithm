    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringBuilder ans = new StringBuilder();
            String input;
            while((input = br.readLine()) != null) {
                String[] inputs = input.split(" ");
                int n = Integer.parseInt(inputs[0]);
                int s = Integer.parseInt(inputs[1]);
                ans.append(s / (n + 1)).append('\n');
            }

            bw.append(ans);
            bw.close();
            br.close();
        }
    }