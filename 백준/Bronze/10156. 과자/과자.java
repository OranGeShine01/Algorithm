import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int answer = Math.max(Integer.parseInt(inputs[0]) * Integer.parseInt(inputs[1]) - Integer.parseInt(inputs[2]), 0);

        bw.append(String.valueOf(answer));
        bw.close();
        br.close();
    }
}