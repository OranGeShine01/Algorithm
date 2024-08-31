import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int answer = 0;

        boolean[] isPrimeArray = isPrime(b);

        for (int i = a; i <= b; i++) {
            if (isUnderPrime(i, isPrimeArray)) answer++;
        }

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    // 에라토스테네스의 체로 소수여부판별, false면 소수
    static boolean[] isPrime(int n) {
        boolean[] isPrime = new boolean[n + 1];
        isPrime[1] = true;
        int sqrt = (int)Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            for (int j = i * i; j <= n; j += i) {
                isPrime[j] = true;
            }
        }
        return isPrime;
    }

    static boolean isUnderPrime(int n, boolean[] isPrime) {
        int count = 1;
        int current = n;
        while(isPrime[current]) {
            int sprt = (int)Math.sqrt(current);
            for (int i = 2; i <= sprt; i++) {
                if (current % i == 0) {
                    count++;
                    current /= i;
                    break;
                }
            }
        }
        return !isPrime[count];
    }
}
