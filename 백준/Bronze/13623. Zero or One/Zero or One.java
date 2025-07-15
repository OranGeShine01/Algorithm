    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] inputs = br.readLine().split(" ");

            boolean ab = inputs[0].equals(inputs[1]);
            boolean ac = inputs[0].equals(inputs[2]);
            boolean bc = inputs[1].equals(inputs[2]);

            StringBuilder ans = new StringBuilder();

            if (ab == ac && bc == ac) ans.append('*');
            else if (ab) ans.append('C');
            else if (bc) ans.append('A');
            else ans.append('B');

            bw.append(ans);
            bw.close();
            br.close();
        }
    }