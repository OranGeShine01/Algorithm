import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        StringBuilder answer = new StringBuilder();

        while ((input = br.readLine()) != null) {
            int n = Integer.parseInt(input);
            int length = (int)Math.pow(3, n);
            char[] ch = new char[length];
            Arrays.fill(ch, '-');
            recursive(0, length, ch);
            answer.append(new String(ch)).append('\n');
        }

        bw.append(answer);
        bw.flush();
        bw.close();
        br.close();
    }

    static void recursive(int start, int length, char[] ch) {
        if (length == 1) return;

        int third = length / 3;
        for (int i = start + third; i < start + 2 * third; i++) {
            ch[i] = ' ';
        }

        recursive(start, third, ch);
        recursive(start + 2 * third, third, ch);
    }
}
