    import java.io.*;
    import java.util.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());
            Stack<Integer> stack = new Stack<>();

            StringBuilder sb = new StringBuilder();

            for (int i=1; i<=n; i++) {
                String str = br.readLine();
                char ch = str.charAt(0);

                switch (ch) {
                    case '1' :
                        String[] arr = str.split(" ");
                        stack.add(Integer.parseInt(arr[1]));
                        break;

                    case '2' :
                        if (!stack.isEmpty()) sb.append(stack.pop());
                        else sb.append(-1);
                        sb.append('\n');
                        break;

                    case '3' :
                        sb.append(stack.size()).append('\n');
                        break;

                    case '4' :
                        if (stack.isEmpty()) sb.append('1');
                        else sb.append('0');
                        sb.append('\n');
                        break;

                    case '5' :
                        if (stack.isEmpty()) sb.append(-1);
                        else sb.append(stack.peek());
                        sb.append('\n');
                        break;
                }
            }

            bw.append(sb);
            bw.close();
            br.close();
        }
    }