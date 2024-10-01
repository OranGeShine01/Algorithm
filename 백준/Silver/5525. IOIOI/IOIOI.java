import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int count = 0;
        int ans = 0;
        int lastIndex = m - 1;

        for (int i = 1; i < lastIndex; i++) {
            if (str.charAt(i) == 'O' && str.charAt(i + 1) == 'I') {
                count++;
                if (count == n) {
                  if (str.charAt(i + 1 - 2 * n) == 'I') ans++;
                  count--;
                }
                i++;
            } else count = 0;

        }

        bw.append(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
    }
}
