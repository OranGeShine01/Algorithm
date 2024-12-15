import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        final int STUDENT_NUMBER = 5;
        final int MIN_SCORE = 40;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int answer = 0;

        for (int i = 0; i < STUDENT_NUMBER; i++) {
            answer += Math.max(MIN_SCORE, Integer.parseInt(br.readLine()));
        }

        bw.append(String.valueOf(answer / STUDENT_NUMBER));
        bw.close();
        br.close();
    }
}