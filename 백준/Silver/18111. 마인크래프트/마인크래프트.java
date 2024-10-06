import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] initialValues = br.readLine().split(" ");
        int n = Integer.parseInt(initialValues[0]);
        int m = Integer.parseInt(initialValues[1]);
        int b = Integer.parseInt(initialValues[2]);

        int[][] map = new int[n][m];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(str[j]);
                min = Math.min(min, map[i][j]);
                max = Math.max(max, map[i][j]);
            }
        }

        int answerTime = Integer.MAX_VALUE;
        int answerHeight = 0;
        for (int i = min; i <= max; i++) {
            int currentB = b;
            int time = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    int workHeight = map[j][k] - i;
                    if (workHeight > 0) {
                        time += workHeight * 2;
                        currentB += workHeight;
                    } else if (workHeight < 0) {
                        time -= workHeight;
                        currentB += workHeight;
                    }
                }
            }
            if (currentB >= 0 && time <= answerTime) {
                answerTime = time;
                answerHeight = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(answerTime).append(' ').append(answerHeight);

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }
}