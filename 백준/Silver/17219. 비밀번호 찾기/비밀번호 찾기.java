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

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            map.put(str[0], str[1]);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            sb.append(map.get(br.readLine())).append('\n');
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }
}