    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());
            int ans = 0;
            String s = br.readLine();
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (isVowel(ch)) ans++;
            }

            bw.append(String.valueOf(ans));
            bw.close();
            br.close();
        }

        static boolean isVowel(char ch) {
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
        }
    }