import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

//        int[][] map = new int[n][n];
        List<int[]> homes = new ArrayList<>();
        List<int[]> chickens = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                if (inputs[j].equals("1")) homes.add(new int[]{i, j});
                else if (inputs[j].equals("2")) chickens.add(new int[]{i, j});
            }
        }

        boolean[] isVisited = new boolean[chickens.size()];
        dfs(0, 0, homes, chickens, isVisited, m);

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int start, int depth, List<int[]> homes, List<int[]> chickens, boolean[] isVisited, int m) {

        int chickensSize = chickens.size();

        if (depth == m) {
            int count = 0;
            for (int[] home : homes) {
                int min = Integer.MAX_VALUE;
                for (int i = 0; i < chickensSize; i++) {
                    if (isVisited[i]) {
                        int[] chicken = chickens.get(i);
                        int distance = Math.abs(chicken[0] - home[0]) + Math.abs(chicken[1] - home[1]);
                        min = Math.min(min, distance);
                    }
                }
                count += min;
            }
            answer = Math.min(answer, count);
            return;
        }

        for (int i = start; i < chickensSize; i++) {
            isVisited[i] = true;
            dfs(i + 1, depth + 1, homes, chickens, isVisited, m);
            isVisited[i] = false;
        }
    }
}
