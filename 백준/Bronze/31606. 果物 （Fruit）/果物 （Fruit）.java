import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int apple =  Integer.parseInt(br.readLine());
        int orange =  Integer.parseInt(br.readLine());

        int ans = apple +  orange + 3;

        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}