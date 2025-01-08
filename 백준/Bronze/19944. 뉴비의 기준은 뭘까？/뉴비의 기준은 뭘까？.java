import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        if (m <= 2) bw.append("NEWBIE!");
        else if (n >= m) bw.append("OLDBIE!");
        else bw.append("TLE!");

        bw.close();
        br.close();
    }
}