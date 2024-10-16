import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        
        while (true) {
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);

            if (n == 0 && m == 0) break;

            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            for (int i = 0; i < n; i++) {
                set1.add(Integer.parseInt(br.readLine()));
            }

            for (int i = 0; i < m; i++) {
                set2.add(Integer.parseInt(br.readLine()));
            }

            int answer = 0;
            for (int i : set1) {
                if (set2.contains(i)) answer++;
            }
            sb.append(answer).append('\n');
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }
}