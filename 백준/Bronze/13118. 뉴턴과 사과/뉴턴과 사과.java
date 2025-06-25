import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] ps = br.readLine().split(" ");
        String[] apple = br.readLine().split(" ");

        int ans = 0;

        for (int i = 0; i < ps.length; i++) {
            if (apple[0].equals(ps[i])) {
                ans = i + 1;
                break;
            }
        }


        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}