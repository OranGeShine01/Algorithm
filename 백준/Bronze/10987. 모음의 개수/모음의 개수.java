import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int len = input.length();
        int answer = 0;

        for (int i = 0; i < len; i++) {
            char ch = input.charAt(i);
            if (isVowel(ch)) answer++;
        }

        bw.append(String.valueOf(answer));
        bw.close();
        br.close();
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i';
    }
}