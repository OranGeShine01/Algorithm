import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[][] elevators = new int[m][2];

        for (int i = 0; i < m; i++) {
            String[] str = br.readLine().split(" ");
            elevators[i][0] = Integer.parseInt(str[0]);
            elevators[i][1] = Integer.parseInt(str[1]);
        }

        int answer = Integer.MAX_VALUE;

        for (int[] elevator : elevators) {
            answer = Math.min(answer, caculateMinFloor(n, elevator[0], elevator[1]));
        }

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    static int caculateMinFloor(int n, int u, int d) {
        int divisor = d * n;
        int dividend = u + d;
        int minX = divisor / dividend;
        if (divisor % dividend != 0) minX += 1;

        int result = Integer.MAX_VALUE;

        for (int i = minX; i <= n; i++) {
            int totalFloor = i * u - (n - i) * d;
            if (totalFloor > 0) {
                result = totalFloor;
                break;
            }
        }
        return result;
    }
}