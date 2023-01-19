import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] fibo = new int[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibo[1] = 1;
        fibo[2] = 2;
        for (int i=3; i<=n; i++) {
            fibo[i] = (fibo[i-1] + fibo[i-2]) % 15746;
        }
        System.out.println(fibo[n]);
    }    
}