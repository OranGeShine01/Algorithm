import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        while (n > 0) {
            int len = Integer.parseInt(br.readLine());
            answer.append("=".repeat(len)).append('\n');
            n--;
        }

        bw.append(answer);
        bw.close();
        br.close();
    }
}