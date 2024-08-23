import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numOfPeople = 0;
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            Map<Integer, String> map = new HashMap<>();
            int[] cnt = new int[n];
            for (int i = 0; i < n; i++) {
                map.put(i, br.readLine());
            }
            int rows = 2 * n - 1;
            for (int i = 0; i < rows; i++) {
                String[] str = br.readLine().split(" ");
                int idx = Integer.parseInt(str[0]) - 1;
                cnt[idx]++;
            }
            for (int i = 0; i < n; i++) {
                if (cnt[i] != 2) {
                    sb.append(++numOfPeople).append(' ').append(map.get(i)).append('\n');
                }
            }
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }
}
