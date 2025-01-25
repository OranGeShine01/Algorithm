import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        while (n > 0) {
            String[] input = br.readLine().split(" ");
            int[] abc = new int[input.length];
            int result = 0;
            for (int i = 0; i < abc.length; i++) {
                abc[i] = Integer.parseInt(input[i]);
            }
            for (int i = 1; i <= abc[0]; i++) {
                for (int j = 1; j <= abc[1]; j++) {
                    for (int k = 1; k <= abc[2]; k++) {
                        if ((i % j) == (j % k) && (i % j) == (k % i)) {
                            result++;
                        }
                    }
                }
            }
            answer.append(result).append('\n');
            n--;
        }

        bw.append(answer);
        bw.close();
        br.close();
    }
}