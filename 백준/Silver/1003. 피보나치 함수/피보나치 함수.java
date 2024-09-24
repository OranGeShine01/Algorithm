import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {

        final int range = 40;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int[][] fibos = new int[range + 1][2];
        fibos[0] = new int[]{1, 0};
        fibos[1] = new int[]{0, 1};
        for (int i = 2; i <= range; i++) {
            for (int j = 0; j < fibos[0].length; j++) {
                fibos[i][j] = fibos[i - 1][j] + fibos[i - 2][j];
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(fibos[n][0]).append(' ').append(fibos[n][1]).append('\n');
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }
}
