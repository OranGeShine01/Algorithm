import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    static int[] queen; // 퀸의 위치를 놓은 배열, 각 순번은 행을 뜻함.
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        queen = new int[n];
        dfs(0);
        System.out.println(count);
    }

    static void dfs(int depth) {
        if (depth == n) {
            count++;
            return;
        }

        for (int i=0; i<n; i++) {
            queen[depth] = i;
            if (ipt(depth)) {
                dfs(depth+1);
            }
        }
    }

    static boolean ipt(int k) {
        for (int i=0; i<k; i++) {
            if (queen[i]==queen[k] || Math.abs(i-k)==Math.abs(queen[i]-queen[k])) {
                return false;
            }
        }
        return true;
    }
}