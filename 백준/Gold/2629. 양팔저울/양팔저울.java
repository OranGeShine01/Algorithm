import java.io.*;

public class Main {

    static boolean[][] dp;
    static int totalWeight;

    static int n;

    static int[] weights;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        추의 갯수
        n = Integer.parseInt(br.readLine());

        String[] inputWeights = br.readLine().split(" ");
        weights = new int[n];

        totalWeight = 0;

        for (int i = 0; i < n; i++) {
            weights[i] = Integer.parseInt(inputWeights[i]);
            totalWeight += weights[i];
        }

        //        i번째 추를 사용해서 무게 j를 만들수있는지 여부를 저장하는 dp
        dp = new boolean[n + 1][totalWeight + 1];
        dp(0, 0);

        int count = Integer.parseInt(br.readLine());
        inputWeights = br.readLine().split(" ");
        int[] testWeights = new int[count];

        for (int i = 0; i < count; i++) {
            testWeights[i] = Integer.parseInt(inputWeights[i]);
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (testWeights[i] > totalWeight) answer.append("N ");
            else if (dp[n][testWeights[i]]) answer.append("Y ");
            else answer.append("N ");
        }

        bw.append(answer);
        bw.close();
        br.close();
    }

    static void dp(int cnt, int val) {

        if (val < 0 || val > totalWeight) return;

        if (dp[cnt][val]) return;
        dp[cnt][val] = true;

        if (cnt < n) {
            dp(cnt + 1, val);
            dp(cnt + 1, Math.abs(val - weights[cnt]));
            dp(cnt + 1, val + weights[cnt]);
        }
    }
}