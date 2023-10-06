import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        final int n = 9;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int max = -1;
        int row = 0;
        int col = 0;

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int k = Integer.parseInt(st.nextToken());
                if (k>max) {
                    max = k;
                    row = i+1;
                    col = j+1;
                }
            }
        }

        bw.append(String.valueOf(max)).append('\n').append(String.valueOf(row)).append(' ').append(String.valueOf(col));

        bw.close();
        br.close();
    }
}