import java.io.*;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {

    static int[] input; // 입력값을 받는 배열
    static Integer[] dp; // 메모이제이션을 할 배열

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        input = new int[n];
        dp = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 1;
        int lisLength = 1; // 가장 긴 부분수열의 길이

        for (int i=1; i<n; i++) {
            lisLength = Math.max(lisLength, dp(i));
        }

        StringBuilder answer = new StringBuilder();
        answer.append(lisLength).append('\n');

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        for (int i = dp.length - 1; i >= 0; i--) {
            if (dp[i] == lisLength) {
                dq.addLast(input[i]);
                lisLength--;
            }
        }

        while (!dq.isEmpty()) {
            answer.append(dq.pollLast()).append(' ');
        }

        bw.append(answer);
        bw.close();
        br.close();
    }

    // k번째 항이 포함된 가장 긴 부분수열의 길이를 구하는 메서드.
    static int dp(int k) {
        if (dp[k] == null) {
            dp[k] = 1; // 초기화
            for (int i = k - 1; i >= 0; i--) {
                if (input[i] < input[k]) {
                    dp[k] = Math.max(dp[k], dp(i) + 1);
                }
            }

        }
        return dp[k];
    }

}