import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> set = new HashSet<>();

        set.add("ChongChong");

        int n = Integer.parseInt(br.readLine());

        while (n > 0) {
            String[] inputs = br.readLine().split(" ");
            for (int i = 0; i < inputs.length; i++) {
                int otherIndex = 1 - i;
                if (set.contains(inputs[i])) {
                    set.add(inputs[otherIndex]);
                }
            }
            n--;
        }

        bw.append(String.valueOf(set.size()));
        bw.flush();
        bw.close();
        br.close();

    }
}
