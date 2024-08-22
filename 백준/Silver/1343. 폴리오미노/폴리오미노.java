import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        str = str.replace("XXXX", "AAAA").replace("XX","BB");

        bw.append(str.contains("X") ? "-1" : str);
        bw.close();
        br.close();

    }
}