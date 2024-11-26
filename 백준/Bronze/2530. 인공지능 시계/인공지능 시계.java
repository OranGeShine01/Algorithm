import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int hours = Integer.parseInt(inputs[0]);
        int minutes = Integer.parseInt(inputs[1]);
        int seconds = Integer.parseInt(inputs[2]);

        int cookingTime = Integer.parseInt(br.readLine());

        seconds += cookingTime;
        minutes += seconds / 60;
        seconds %= 60;
        hours += minutes / 60;
        minutes %= 60;
        hours %= 24;

        StringBuilder answer = new StringBuilder();
        answer.append(hours).append(' ').append(minutes).append(' ').append(seconds);

        bw.append(answer);

        bw.flush();
        bw.close();
        br.close();
    }
}