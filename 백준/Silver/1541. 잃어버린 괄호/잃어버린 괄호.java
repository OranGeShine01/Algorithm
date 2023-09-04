import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //숫자와 부호를 분리하는 정규표현식
        Pattern pattern = Pattern.compile("[-+]|\\d+");

        //입력값을 정규표현식으로 분리
        Matcher matcher = pattern.matcher(br.readLine());

        int ans = 0;
        boolean minus = false;
        while (matcher.find()) {
            String str = matcher.group();
            if (str.equals("-")) {
                minus = true;
            } else if (str.equals("+")) {
                continue;
            } else if (minus)  {
                ans-=Integer.parseInt(str);
            } else if (!minus) {
                ans+=Integer.parseInt(str);
            }
        }

        bw.append(String.valueOf(ans));
        bw.close();
        br.close();
    }
}