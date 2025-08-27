    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            final int[] scores = new int[]{6, 3, 2, 1, 2};

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            char input = br.readLine().charAt(0);

            bw.append(input == 'n' || input == 'N' ? "Naver D2" : "Naver Whale");
            bw.close();
            br.close();
        }
    }