import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            answer.append(i).append(". ").append(br.readLine()).append('\n');
        }

        bw.append(answer);
        bw.close();
        br.close();
    }
}