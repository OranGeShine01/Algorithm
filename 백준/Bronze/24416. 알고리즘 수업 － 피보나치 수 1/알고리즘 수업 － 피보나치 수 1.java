import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] f = new int[41];
    static int count1 = 0;
    static int count2 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        f[1] = 1;
        f[2] = 1;
        fib(n);
        fibonacci(n);
        System.out.println(count1 + " " + count2);

    }

    static int fib(int n) {
        if (n<=2) {
            count1++;
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }

    static int fibonacci(int n) {
        for (int i=3; i<=n; i++) {
            f[i] = f[i-1] + f[i-2];
            count2++;
        }
        return f[n];
    }

}