import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Integer> list;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        list = new ArrayList<>();

        String[] inputs = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(inputs[i]);
        }

        list.add(a[0]);

        for (int i = 1; i < n; i++) {
            int lastIdx = list.size() - 1;
            if (a[i] > list.get(lastIdx)) list.add(a[i]);
            else {
                int replaceIdx = lowerBound(a[i]);
                list.set(replaceIdx, a[i]);
            }
        }

        bw.append(String.valueOf(list.size()));

        bw.flush();
        bw.close();
        br.close();
    }

    static int lowerBound(int target) {
        int start = 0;
        int end = list.size();
        while (start < end) {
            int mid = (start + end) >>> 1;
            if (list.get(mid) < target) start = mid + 1;
            else end = mid;
        }

        return start;
    }
}