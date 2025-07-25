import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        long totalSize = 1;

        for (String i : input) {
            totalSize *= Long.parseLong(i);
        }

        bw.append(String.valueOf(totalSize / 2));
        bw.close();
        br.close();
    }
}