    import java.io.*;
    import java.util.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringBuilder sb = new StringBuilder();

            while(true) {

                Stack<Character> stack = new Stack<>();
                String str = br.readLine();

                if (str.equals(".")) break;
                int l = str.length();
                boolean bl = true;
                for (int i=0; i<l; i++) {
                    char ch = str.charAt(i);
                    if (ch=='(') stack.add('(');
                    else if (ch=='[') stack.add('[');
                    else if (ch==')') {
                        if (!stack.empty() && stack.peek()=='(') stack.pop();
                        else {
                            bl = false;
                            break;
                        }
                    }
                    else if (ch==']') {
                        if (!stack.empty() && stack.peek()=='[') stack.pop();
                        else {
                            bl = false;
                            break;
                        }
                    }
                }

                if (bl && stack.empty()) sb.append("yes");
                else sb.append("no");

                sb.append('\n');

            }

            bw.append(sb);
            bw.close();
            br.close();
        }
    }