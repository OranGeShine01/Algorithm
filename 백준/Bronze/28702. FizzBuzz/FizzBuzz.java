import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Main {

    public static void main(String[] args) throws Exception {

        final String[] fizzBuzzPatterns = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11",
        "Fizz", "13", "14", "FizzBuzz"};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
        }

        int index = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i< str.length; i++) {
            if (isInteger(str[i])) {
                index = Integer.parseInt(str[i]) + 3 - i;
                if (index % 3 == 0 || index % 5 == 0) {
                    int tempIdx = index % 15;
                    sb.append(fizzBuzzPatterns[tempIdx == 0 ? 14 : tempIdx - 1]);
                } else sb.append(index);
                break;
            }
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isInteger(String str) {
        if (str == null) return false;
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
