import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int day = Integer.parseInt(br.readLine()) % 10;

        int ans = 0;
        String[] inputs = br.readLine().split(" ");

        for (int i = 0; i < inputs.length; i++) {
            if (day == Integer.parseInt(inputs[i])) ans++;
        }

        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}