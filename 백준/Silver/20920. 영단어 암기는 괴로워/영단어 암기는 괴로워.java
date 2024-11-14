import java.io.*;
import java.util.*;

public class Main {

    static final int INF = 200000000;

    static class Node implements Comparable<Node> {
        int vertex;
        int weight;

        public Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node node) {
            return weight - node.weight;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        Map<String, Integer> map = new HashMap<>();

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            set.add(input);
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        List<String> list = new ArrayList<>();

        for (String s : set) {
            if (s.length() >= m) list.add(s);
        }

        Collections.sort(list, (o1, o2) -> {
            if (map.get(o1) == map.get(o2)) {
                int o1Len = o1.length();
                int o2Len = o2.length();
                if (o1Len == o2Len) return o1.compareTo(o2);
                return Integer.compare(o2Len, o1Len);
            }
            return map.get(o2).compareTo(map.get(o1));
        });

        StringBuilder answer = new StringBuilder();
        for (String s : list) {
            answer.append(s).append('\n');
        }

        bw.append(answer);
        bw.flush();
        bw.close();
        br.close();
    }
}
