import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            StringBuilder sb = new StringBuilder(str);
            if (str.equals("0")) break;
            if (str.equals(sb.reverse().toString())) System.out.println("yes");
            else System.out.println("no");
        }

        br.close();
    }
}