import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] seq; // 수열을 담을 배열
    static Integer[] memo; // 메모이제이션으로 저장할 각 수열에서의 최대값
    static int max; // 연속합의 최대값
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        seq = new int[n];
        memo = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        memo[0] = seq[0];
        max = seq[0]; //처음 최댓값은 첫번째 값.
        sumMax(n-1);
        System.out.println(max);


    }

    // 메모이제이션으로 저장한 연속합+현재값과, 현재값을 비교하여 메모이제이션의 갱신여부를 구하는 메서드.
    static int sumMax(int n) {

        for (int i=1; i<=n; i++) {
            if (memo[i]==null) {
                memo[i] = Math.max(memo[i-1]+seq[i], seq[i]);
                max = Math.max(memo[i], max);
            }
        }
        return memo[n];
    }

}

