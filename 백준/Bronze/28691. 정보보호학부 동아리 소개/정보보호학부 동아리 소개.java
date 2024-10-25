import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        if ("M".equals(str)) {
            bw.write("MatKor");
        } else if ("W".equals(str)) {
            bw.write("WiCys");
        } else if ("C".equals(str)) {
            bw.write("CyKor");
        } else if ("A".equals(str)) {
            bw.write("AlKor");
        } else if ("$".equals(str)) {
            bw.write("$clear");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
