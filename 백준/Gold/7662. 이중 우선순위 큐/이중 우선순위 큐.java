import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < t; i++) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            int k = Integer.parseInt(br.readLine());
            for (int j = 0; j < k; j++) {
                String[] commands = br.readLine().split(" ");
                int number = Integer.parseInt(commands[1]);
                if (commands[0].equals("I")) {
                    map.put(number, map.getOrDefault(number, 0) + 1);
                } else if (!map.isEmpty()) {
                    if (number == 1) {
                        int value = map.get(map.lastKey());
                        if (value > 1) map.put(map.lastKey(), value - 1);
                        else map.remove(map.lastKey());
                    }
                    else if (number == -1) {
                        int value = map.get(map.firstKey());
                        if (value > 1) map.put(map.firstKey(), value - 1);
                        else map.remove(map.firstKey());
                    }
                }
            }
            if (map.isEmpty()) sb.append("EMPTY");
            else sb.append(map.lastKey()).append(' ').append(map.firstKey());
            sb.append('\n');
        }

        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }
}