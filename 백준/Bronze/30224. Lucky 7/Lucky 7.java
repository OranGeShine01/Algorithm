import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;
        String input = br.readLine();
        int inputValue = Integer.parseInt(input);

        if (input.contains("7")) answer |= 2;
        if (inputValue % 7 == 0) answer |= 1;

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
}
