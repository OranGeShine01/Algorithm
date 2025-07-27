    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());
            boolean[] isOrdered = new boolean[n];
            StringBuilder ans = new StringBuilder("Gnomes:\n");

            for (int i = 0; i < n; i++) {
                String[] input = br.readLine().split(" ");
                int len = input.length;
                int[] gnomes = new int[len];
                for (int j = 0; j < len; j++) {
                    gnomes[j] = Integer.parseInt(input[j]);
                }
                if (gnomes[0] > gnomes[1] && gnomes[1] > gnomes[2]) isOrdered[i] = true;
                else if (gnomes[0] < gnomes[1] && gnomes[1] < gnomes[2]) isOrdered[i] = true;
                ans.append(isOrdered[i] ? "Ordered" : "Unordered").append('\n');
            }
            bw.append(ans);
            bw.close();
            br.close();
        }
    }