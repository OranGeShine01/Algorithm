    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int chickens = Integer.parseInt(br.readLine());
            String[] inputs = br.readLine().split(" ");
            int cola = Integer.parseInt(inputs[0]);
            int beer = Integer.parseInt(inputs[1]);

            int ans = Math.min(chickens, cola / 2 + beer);

            bw.append(String.valueOf(ans));
            bw.close();
            br.close();
        }
    }