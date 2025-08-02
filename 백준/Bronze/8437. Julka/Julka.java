    import java.io.*;
    import java.math.BigInteger;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringBuilder ans = new StringBuilder();
            BigInteger sum = new BigInteger(br.readLine());
            BigInteger gap = new BigInteger(br.readLine());
            BigInteger half = new BigInteger("2");

            ans.append(sum.add(gap).divide(half)).append('\n').append(sum.subtract(gap).divide(half));

            bw.append(ans);
            bw.close();
            br.close();
        }
    }