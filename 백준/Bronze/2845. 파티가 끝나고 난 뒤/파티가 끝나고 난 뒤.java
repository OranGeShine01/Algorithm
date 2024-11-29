import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] lp = br.readLine().split(" ");
        int calculatedValue = Integer.parseInt(lp[0]) * Integer.parseInt(lp[1]);
        String[] inputs = br.readLine().split(" ");
        StringBuilder answer = new StringBuilder();

        for (String s: inputs) {
            int input = Integer.parseInt(s);
            answer.append(input - calculatedValue).append(' ');
        }

        bw.append(answer);
        bw.close();
        br.close();
    }
}