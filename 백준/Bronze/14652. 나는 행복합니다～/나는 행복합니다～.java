import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        int m = Integer.parseInt(inputs[1]);
        int stand = Integer.parseInt(inputs[2]);

        StringBuilder ans = new StringBuilder();

        ans.append(stand / m).append(' ').append(stand % m);

        bw.append(ans);
        bw.close();
        br.close();
    }
}