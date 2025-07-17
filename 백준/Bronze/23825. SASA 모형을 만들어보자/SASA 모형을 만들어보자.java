    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);

            int ans = Math.min(a, b) / 2;

            bw.append(String.valueOf(ans));
            bw.close();
            br.close();
        }
    }