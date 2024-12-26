import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringBuilder input = new StringBuilder(br.readLine()).reverse();
            answer.append(input).append('\n');
        }

        bw.append(answer);
        bw.close();
        br.close();
    }
}