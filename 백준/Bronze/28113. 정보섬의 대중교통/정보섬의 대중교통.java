import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nab = br.readLine().split(" ");
        int a = Integer.parseInt(nab[1]);
        int b = Integer.parseInt(nab[2]);

        if (a == b) bw.append("Anything");
        else if (a > b) bw.append("Subway");
        else bw.append("Bus");

        bw.flush();
        bw.close();
        br.close();

    }
}
