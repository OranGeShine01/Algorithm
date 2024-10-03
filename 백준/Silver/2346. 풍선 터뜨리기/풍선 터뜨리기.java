import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {

        class Balloon {
            int index;
            int number;

            public Balloon(int index, int number) {
                this.index = index;
                this.number = number;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        LinkedList<Balloon> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(str[i - 1]);
            list.add(new Balloon(i, number));
        }

        int currentIndex = 0;
        StringBuilder sb = new StringBuilder();

        while (!list.isEmpty()) {
            Balloon current = list.remove(currentIndex);
            int distance = current.number;
            sb.append(current.index).append(' ');

            if (list.isEmpty()) break;

            if (distance > 0) {
                currentIndex = (currentIndex + distance - 1) % list.size();
            } else {
                int size = list.size();
                currentIndex = (currentIndex + distance) % size;
                if (currentIndex < 0) currentIndex += size;
            }
        }


        bw.append(sb);
        bw.flush();
        bw.close();
        br.close();
    }
}
