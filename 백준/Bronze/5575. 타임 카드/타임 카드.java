import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            String[] inputs = br.readLine().split(" ");
            int[] times = new int[6];
            for (int j = 0; j < 6; j++) {
                times[j] = Integer.parseInt(inputs[j]);
            }

            int startTime = times[0] * 3600 + times[1] * 60 + times[2];
            int endTime = times[3] * 3600 + times[4] * 60 + times[5];

            int workingTime = endTime - startTime;

            int hours = workingTime / 3600;
            workingTime %= 3600;
            int minutes = workingTime / 60;
            workingTime %= 60;
            answer.append(hours).append(' ').append(minutes).append(' ').append(workingTime).append('\n');
        }


        bw.append(answer);
        bw.close();
        br.close();
    }
}