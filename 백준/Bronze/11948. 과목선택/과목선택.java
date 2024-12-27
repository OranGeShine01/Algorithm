import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        final int NUM_OF_SUBJECT = 6;
        final int MAX_SCORE = 101;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] scores = new int[NUM_OF_SUBJECT];
        int answer = 0;
        int science = MAX_SCORE;
        int social = MAX_SCORE;

        for (int i = 0; i < NUM_OF_SUBJECT; i++) {
            scores[i] = Integer.parseInt(br.readLine());
            if (i < 4) {
                science = Math.min(science, scores[i]);
            } else {
                social = Math.min(social, scores[i]);
            }
            answer += scores[i];
        }

        answer -= science;
        answer -= social;

        bw.append(String.valueOf(answer));
        bw.close();
        br.close();
    }
}