import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = st.countTokens();
        long[] l = new long[len];
        long ans = 0;
        for (int i=0; i<len; i++) {
            l[i] = Long.parseLong(st.nextToken());
            ans+=l[i];
        }
        System.out.println(ans);

    }
}