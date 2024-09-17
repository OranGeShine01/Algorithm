import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            String[] str = br.readLine().split(" ");
            int m = Integer.parseInt(str[0]);
            int n = Integer.parseInt(str[1]);
            int x = Integer.parseInt(str[2]);
            int y = Integer.parseInt(str[3]);

            int k = x;
            int lcm = lcm(m, n);
            while (k <= lcm) {
                if ((k - 1) % n + 1 == y) {
                    break;
                }
                k += m;
            }
            sb.append(k <= lcm ? k : -1).append('\n');
        }


        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
