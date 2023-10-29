    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            long n = Long.parseLong(br.readLine());
            StringBuilder sb = new StringBuilder();
            long sum = 0;
            if (n>=3) sum=(((n-2)*(n-1)*(2*n-3))/6+((n-1)*(n-2))/2)/2;
            sb.append(sum).append('\n').append('3');
            bw.append(sb);
            bw.close();
            br.close();
        }
    }