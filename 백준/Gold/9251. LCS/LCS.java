import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Integer[][] lcs; // 두 문자열의 x, y번쨰까지의 lcs

    // 두 문자열을 static으로 선언.
    static String str1;
    static String str2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str1 = br.readLine();
        str2 = br.readLine();
        int l1 = str1.length();
        int l2 = str2.length();
        lcs = new Integer[l1][l2];
        System.out.println(lcs(l1-1, l2-1));

    }

    // 두 문자열의 x번째, y번째 lcs를 구하는 method
    static int lcs(int x, int y) {

        if (x<0 || y<0) {
            return 0;
        }

        if (lcs[x][y]==null) {

            if (str1.charAt(x) == str2.charAt(y)) {
                lcs[x][y] = lcs(x-1, y-1)+1;
            } else {
              lcs[x][y] = Math.max(lcs(x-1, y), lcs(x, y-1));
            }
            
        }
        return lcs[x][y];
    }
}