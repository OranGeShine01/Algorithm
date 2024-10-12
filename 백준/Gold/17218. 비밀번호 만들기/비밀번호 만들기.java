import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];

        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                char ch1 = str1.charAt(i - 1);
                char ch2 = str2.charAt(j - 1);
                if (ch1 == ch2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        int n = len1;
        int m = len2;
        StringBuilder sb = new StringBuilder();

        while(n > 0 && m > 0) {
            char ch1 = str1.charAt(n - 1);
            char ch2 = str2.charAt(m - 1);
            if (ch1 == ch2) {
                sb.append(ch1);
                n--;
                m--;
            } else {
                if (dp[n - 1][m] > dp[n][m - 1]) {
                    n--;
                } else m--;
            }
        }

        bw.append(sb.reverse());
        bw.flush();
        bw.close();
        br.close();
    }
}