import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringBuilder answer  = new StringBuilder();

        for (int i = n; i > 0; i--) {
            answer.append("*".repeat(i)).append('\n');
        }

        bw.append(answer);

        bw.flush();
        bw.close();
        br.close();
    }
}