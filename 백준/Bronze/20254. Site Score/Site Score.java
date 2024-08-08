import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int ur = Integer.parseInt(str[0]) * 56;
        int tr = Integer.parseInt(str[1]) * 24;
        int uo = Integer.parseInt(str[2]) * 14;
        int to = Integer.parseInt(str[3]) * 6;

        bw.append(String.valueOf(ur + tr + uo + to));
        bw.close();
    }
}