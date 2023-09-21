import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        int count = 1;
        StringBuilder sb = new StringBuilder("<");
        for (int i=1; i<=n; i++) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            if (count%k!=0) {
                int temp = queue.poll();
                queue.add(temp);
            } else if (queue.size()==1) {
                sb.append(queue.poll()).append('>');
            } else sb.append(queue.poll()).append(", ");
            count++;
        }
        System.out.println(sb);
    }
}