    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] inputs = br.readLine().split(" ");
            int monster = Integer.parseInt(inputs[0]);
            int user = Integer.parseInt(inputs[1]);

            char ans = monster * ( 100 - user ) < 10000 ? '1' : '0';
            
            bw.append(ans);
            bw.close();
            br.close();
        }
    }