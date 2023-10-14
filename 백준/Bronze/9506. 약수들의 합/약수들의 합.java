    import java.io.*;
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringBuilder sb = new StringBuilder();
            while(true) {
                int n = Integer.parseInt(br.readLine());
                if (n==-1) break;
                double sqrt = Math.sqrt(n);
                List<Integer> list = new ArrayList<>();
                list.add(1);
                int sum = 1;
                for (int i=2; i<=sqrt; i++) {
                    if (n%i==0) {
                        if (i==sqrt) {
                            list.add(i);
                            sum+=i;
                        }
                        else {
                            list.add(i);
                            list.add(n/i);
                            sum+=(i+n/i);
                        }
                    }
                }
                if (n!=sum) sb.append(n).append(" is NOT perfect.").append('\n');
                else {
                    Collections.sort(list);
                    sb.append(n);
                    for (int i=0; i<list.size(); i++) {
                        if (i==0) sb.append(" = ").append(list.get(i));
                        else sb.append(" + ").append(list.get(i));
                    }
                    sb.append('\n');
                }
            }

            bw.append(sb);
            bw.close();
            br.close();
        }
    }