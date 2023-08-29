import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int len = str.length();
        int n = Integer.parseInt(br.readLine());
        int[][] ps = new int[26][len+1];
        for (int i=0; i<26; i++) {
            int count = 0;
            for (int j=1; j<len+1; j++) {
                if (str.charAt(j-1)==(char)(97+i)) {
                    count++;
                }
                ps[i][j] = count;
            }
        }

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char ch = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            System.out.println(ps[ch-97][r+1] - ps[ch-97][l]);
        }
    }
}