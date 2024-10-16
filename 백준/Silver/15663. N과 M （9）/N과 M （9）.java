import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static Set<String> set;
    static StringBuilder answer;
    static int m;
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        answer = new StringBuilder();
        set = new HashSet<>();

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        int[] arr = new int[n];
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(arr);
        dfs(arr, 0, new StringBuilder(), 0);

        bw.append(answer);
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int[] arr, int depth, StringBuilder sb, int visited) {
        if (depth == m) {
            String str = sb.toString();
            if (!set.contains(str)) {
                set.add(str);
                answer.append(sb).append('\n');
            }
            return;
        }

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if ((visited & (1 << i)) == 0) {
                int len = sb.length();
                sb.append(arr[i]).append(' ');
                dfs(arr, depth + 1, sb, visited | 1 << i);
                sb.setLength(len);
            }
        }
    }

}