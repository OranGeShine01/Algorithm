    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] inputs = br.readLine().split(" ");
            char ans = inputs[0].equals(inputs[1]) ? '1' : '0';

            bw.append(ans);
            bw.close();
            br.close();
        }
    }