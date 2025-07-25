    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] inputs = br.readLine().split(" ");
            int a = 100 - Integer.parseInt(inputs[0]);
            int b = 100 - Integer.parseInt(inputs[1]);

            int c = 100 - a - b;
            int d = a * b;

            int q = d / 100;
            int r = d % 100;

            StringBuilder ans = new StringBuilder();

            ans.append(a).append(' ').append(b).append(' ').append(c).append(' ').append(d).append(' ').append(q).append(' ').append(r).append('\n').append(c+q).append(' ').append(r);
            
            bw.append(ans);
            bw.close();
            br.close();
        }
    }