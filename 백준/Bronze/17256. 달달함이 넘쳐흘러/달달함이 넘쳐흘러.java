import java.io.*;

public class Main {



    public static void main(String[] args) throws IOException {

        final double pi = 3.141592;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = br.readLine().split(" ");
        String[] c = br.readLine().split(" ");
        int[] b = new int[3];

        b[0] = Integer.parseInt(c[0]) - Integer.parseInt(a[2]);
        b[1] = Integer.parseInt(c[1]) / Integer.parseInt(a[1]);
        b[2] = Integer.parseInt(c[2]) - Integer.parseInt(a[0]);

        StringBuilder ans = new StringBuilder();

        for (int i : b) {
            ans.append(i).append(' ');
        }

        bw.append(ans);
        bw.close();
        br.close();
    }
}