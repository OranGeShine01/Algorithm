import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String bomb = br.readLine();

        int bombLength = bomb.length();
        char[] answer = new char[input.length()];
        int idx = 0;

        for (int i = 0; i < answer.length; i++) {
            answer[idx] = input.charAt(i);
            idx++;

            if (idx >= bombLength) {
                boolean isBomb = true;
                for (int j = 0; j < bombLength; j++) {
                    if (answer[idx - bombLength + j] != bomb.charAt(j)) {
                        isBomb = false;
                        break;
                    }
                }
                if (isBomb) idx -= bombLength;
            }
        }

        bw.append(idx == 0 ? "FRULA" : new String(answer, 0, idx));
        bw.close();
        br.close();
    }
}