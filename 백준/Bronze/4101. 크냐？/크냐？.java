import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                String line = br.readLine();
                if (line.equals("0 0")) break;
                String[] str = line.split(" ");
                int a = Integer.parseInt(str[0]);
                int b = Integer.parseInt(str[1]);

                String ans = a > b ? "Yes" : "No";
                System.out.println(ans);
            }


            br.close();
        }
    }