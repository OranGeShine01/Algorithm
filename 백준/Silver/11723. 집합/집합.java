import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            switch (str[0]) {
                case "add" :
                    int num1 = Integer.parseInt(str[1]);
                    set.add(num1);
                    break;
                case "remove" :
                    int num2 = Integer.parseInt(str[1]);
                    set.remove(num2);
                    break;
                case "check" :
                    int num3 = Integer.parseInt(str[1]);
                    sb.append(set.contains(num3) ? 1 : 0).append('\n');
                    break;
                case "toggle" :
                    int num4 = Integer.parseInt(str[1]);
                    if (set.contains(num4)) set.remove(num4);
                    else set.add(num4);
                    break;
                case "empty" :
                    set.clear();
                    break;
                case "all" :
                    set.clear();
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                    break;
            }
        }


        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }
}
