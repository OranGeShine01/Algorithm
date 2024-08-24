import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int r = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);

        bw.append(String.valueOf(recur(0, n, r, c)));
        bw.flush();
        bw.close();
        br.close();
    }

    private static int recur(int count, int n, int r, int c) {
        int side = (int)Math.pow(2, n);
        int mid = side / 2;
        int quarter = side * side / 4;
        int quadrant = 0;

        if (c < mid) {
            if (r >= mid) {
                quadrant = 2;
                r -= mid;
            }
        } else {
            c -= mid;
            if (r < mid) quadrant = 1;
            else {
                quadrant = 3;
                r -= mid;
            }
        }

        count += quadrant * quarter;

        if (n == 1) return count;
        return recur(count, n - 1, r, c);
    }
}
