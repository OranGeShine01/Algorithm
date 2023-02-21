import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Integer[] dp; // n번째 포도주의 최대값을 저장할 배열.
    static int[] input; // 각 포도주 잔의 입력값을 저장할 배열.


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n+1];
        input = new int[n+1];

        for (int i=1; i<=n; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        //초기값 설정 (n=1과 n=2)
        dp[0] = 0;
        dp[1] = input[1];
        if (n>1) {
            dp[2] = input[1] + input[2];
        }
        System.out.println(wine(n));
    }

    //k번째 포도주 중 규칙에 따라 마시는 가장 많은 양을 구하는 메서드.
    static int wine(int k) {
        if (dp[k]==null) {
            dp[k] = Math.max(Math.max(wine(k-2), wine(k-3) + input[k-1]) + input[k], wine(k-1));
        }
        return dp[k];
    }
}