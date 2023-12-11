    import java.io.*;
    import java.util.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());

            Deque<Integer> deque = new ArrayDeque<>();
            StringBuilder sb = new StringBuilder();

            for (int i=1; i<=n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                switch (st.nextToken()) {
                    case "push" :
                        deque.add(Integer.parseInt(st.nextToken()));
                        break;
                    case "pop" :
                        sb.append(deque.isEmpty() ? -1 : deque.pop()).append('\n');
                        break;
                    case "size" :
                        sb.append(deque.size()).append('\n');
                        break;
                    case "empty" :
                        sb.append(deque.isEmpty() ? 1 : 0).append('\n');
                        break;
                    case "front" :
                        sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append('\n');
                        break;
                    case "back" :
                        sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append('\n');
                        break;
                }
            }

            bw.append(sb);
            bw.close();
            br.close();
        }
    }