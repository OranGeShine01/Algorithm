import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder answer = new StringBuilder();
        while(true) {
            int count = 0;
            String input = br.readLine();
            if (input.equals("#")) break;
            char[] charArray = input.toCharArray();
            for (char ch : charArray) {
                if (isVowel(ch)) count++;
            }
            answer.append(count).append('\n');
        }

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    static boolean isVowel(char ch) {
        char result = Character.toLowerCase(ch);
        return result == 'a' || result == 'e' || result == 'o' || result == 'u' || result == 'i';
    }
}
