import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            StringBuilder sb = new StringBuilder();
            char prevCh = input.charAt(0);
            sb.append(prevCh);
            int len = input.length();


            for (int j = 1; j < len; j++) {
                char ch = input.charAt(j);
                if (prevCh != ch) {
                    sb.append(ch);
                    prevCh = ch;
                }
            }
            answer.append(sb).append('\n');
        }

        bw.append(answer);
        bw.close();
        br.close();
    }
}