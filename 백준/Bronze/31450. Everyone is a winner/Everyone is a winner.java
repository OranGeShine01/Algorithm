import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int teacher = Integer.parseInt(inputs[0]);
        int students = Integer.parseInt(inputs[1]);

        String ans = teacher % students == 0 ? "Yes" : "No";

        bw.append(ans);
        bw.close();
        br.close();
    }
}