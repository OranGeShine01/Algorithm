    import java.io.*;
    import java.util.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            TreeSet<String> set = new TreeSet<>();
            int n = Integer.parseInt(br.readLine());

            for (int i=0; i<n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String str = st.nextToken();
                if (st.nextToken().equals("enter")) set.add(str);
                else set.remove(str);
            }

            StringBuilder sb = new StringBuilder();

            for (String str : set.descendingSet()) {
                sb.append(str).append('\n');
            }

            bw.append(sb);
            bw.close();
            br.close();
        }
    }