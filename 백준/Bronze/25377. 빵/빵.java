import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int answer = Integer.MAX_VALUE;
        while (n > 0) {
            String[] input = br.readLine().split(" ");
            int[] ab = new int[input.length];
            for (int i = 0; i < ab.length; i++) {
                ab[i] = Integer.parseInt(input[i]);
            }
            if (ab[1] >= ab[0] && answer > ab[1]) answer = ab[1];
            n--;
        }

        bw.append(String.valueOf(answer == Integer.MAX_VALUE ? -1 : answer));
        bw.close();
        br.close();
    }
}