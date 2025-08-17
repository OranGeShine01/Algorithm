    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] inputs = br.readLine().split(" ");
            int sum = 0;

            for (String input : inputs) {
                sum += Integer.parseInt(input);
            }

            bw.append(String.valueOf(sum * 5));
            bw.close();
            br.close();
        }
    }