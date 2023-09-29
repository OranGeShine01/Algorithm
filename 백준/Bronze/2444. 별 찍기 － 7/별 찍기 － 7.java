import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int l = 2*n-1;
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<l; i++) {
            if (i<n) {
                for (int j=0; j<n+i; j++) {
                    if (j<n-1-i) sb.append(' ');
                    else sb.append('*');
                }
            } else {
                for (int j=0; j<l-i+n-1; j++) {
                    if (j<i-n+1) sb.append(' ');
                    else sb.append('*');
                }
            }
            sb.append('\n');
        }

        bw.append(sb);

        bw.flush();
        bw.close();
        br.close();

    }
}