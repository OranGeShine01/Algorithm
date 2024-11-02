import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while (n > 0) {
            String[] abx = br.readLine().split(" ");
            int a = Integer.parseInt(abx[0]);
            int b = Integer.parseInt(abx[1]);
            int x = Integer.parseInt(abx[2]);
            answer.append(a * (x - 1) + b).append('\n');
            n--;
        }




        bw.append(answer);
        bw.flush();
        bw.close();
        br.close();

    }
}
