import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int ans = (Integer.parseInt(str[0]) + 1) * (Integer.parseInt(str[1]) + 1) / (Integer.parseInt(str[2]) + 1) - 1;
        bw.append(String.valueOf(ans));
        bw.close();
    }
}