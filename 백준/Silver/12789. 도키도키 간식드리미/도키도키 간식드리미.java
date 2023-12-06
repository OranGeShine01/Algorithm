    import java.io.*;
    import java.util.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            Queue<Integer> queue = new LinkedList<>();
            Stack<Integer> stack = new Stack<>();
            Stack<Integer> stack2 = new Stack<>();

            while (st.hasMoreTokens()) {
                queue.add(Integer.parseInt(st.nextToken()));
            }

            stack.add(0);

            while (!queue.isEmpty() || !stack2.empty()) {
                if (!queue.isEmpty() && stack.peek()==queue.peek()+1) {
                    stack.add(queue.poll());
                } else if (!stack2.empty() && stack2.peek()==stack.peek()+1){
                    stack.add(stack2.pop());
                } else if (!queue.isEmpty()) {
                    stack2.add(queue.poll());
                } else break;
            }

            bw.append((stack.size()==n+1) ? "Nice" : "Sad");
            bw.close();
            br.close();
        }
    }