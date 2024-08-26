import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 1;
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            if (count != 1) sb.append('\n');
            boolean hasGroupNasty = false;
            String[][] arr = new String[n][n];
            sb.append("Group ").append(count).append('\n');

            for (int i = 0; i < n; i++) {
                String[] str = br.readLine().split(" ");
                for (int j = 0; j < n; j++) {
                    arr[i][j] = str[j];
                }
            }

            for (int i = 0; i < n; i++) {
                int idx = i;
                for (int j = 1; j < n; j++) {
                    idx--;
                    if (idx < 0) idx += n;
                    if (arr[i][j].equals("N")) {
                        hasGroupNasty = true;
                        sb.append(arr[idx][0]).append(" was nasty about ").append(arr[i][0]).append('\n');
                    }
                }
            }
            if (!hasGroupNasty) sb.append("Nobody was nasty").append('\n');
            count++;
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }
}
