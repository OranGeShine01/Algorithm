import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringBuilder ans = new StringBuilder();

        while (n > 0) {
            String[] inputs = br.readLine().split(" ");
            int face = 2 + Integer.parseInt(inputs[1]) - Integer.parseInt(inputs[0]);
            ans.append(face).append('\n');
            n--;
        }

        bw.append(ans);
        bw.close();
        br.close();
    }
}