    import java.io.*;
    import java.math.BigInteger;
    import java.util.Deque;
    import java.util.LinkedList;
    import java.util.StringTokenizer;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            Deque<Integer> deque = new LinkedList<>();

            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while(n>0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int k = Integer.parseInt(st.nextToken());
                if (k<=2) {
                    int x = Integer.parseInt(st.nextToken());
                    if (k==1) deque.addFirst(x);
                    else deque.addLast(x);
                } else if (k<=4) {
                    if (deque.isEmpty()) sb.append(-1).append('\n');
                    else if (k==3) sb.append(deque.removeFirst()).append('\n');
                    else sb.append(deque.removeLast()).append('\n');
                } else if (k==5) sb.append(deque.size()).append('\n');
                else if (k==6) sb.append((deque.isEmpty()) ? 1 : 0).append('\n');
                else {
                    if (deque.isEmpty()) sb.append(-1).append('\n');
                    else if (k==7) sb.append(deque.peekFirst()).append('\n');
                    else sb.append(deque.peekLast()).append('\n');
                }
                n--;
            }

            bw.append(sb);
            bw.close();
            br.close();
        }
    }