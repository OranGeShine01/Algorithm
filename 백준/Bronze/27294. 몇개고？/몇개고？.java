import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int t = Integer.parseInt(str[0]);
        int s = Integer.parseInt(str[1]);

        if (t >= 12 && t <= 16 && s == 0) bw.append("320");
        else bw.append("280");

        bw.flush();
        bw.close();
        br.close();

    }
}
