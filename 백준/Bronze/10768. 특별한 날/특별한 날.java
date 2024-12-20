import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int month = Integer.parseInt(br.readLine());
        int day = Integer.parseInt(br.readLine());

        String answer;

        if (month > 2 || (month == 2 && day > 18)) answer = "After";
        else if (month < 2 || (month == 2 && day < 18)) answer = "Before";
        else answer = "Special";

        bw.append(answer);
        bw.close();
        br.close();
    }
}