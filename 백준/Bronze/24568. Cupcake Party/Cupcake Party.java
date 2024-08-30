import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {

        final int REGULAR = 8;
        final int SMALL = 3;
        final int STUDENTS = 28;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int r = Integer.parseInt(br.readLine());
        int s = Integer.parseInt(br.readLine());

        int mod = r * REGULAR + s * SMALL - STUDENTS;

        bw.append(String.valueOf(mod));
        bw.flush();
        bw.close();
        br.close();
    }
}
