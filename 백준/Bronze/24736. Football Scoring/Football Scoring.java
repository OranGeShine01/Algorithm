    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            final int[] scores = new int[]{6, 3, 2, 1, 2};

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] awayTeamScores = br.readLine().split(" ");
            String[] homeTeamScores = br.readLine().split(" ");

            int[] total = new int[2];

            for (int i = 0; i < scores.length; i++) {
                total[0] += Integer.parseInt(awayTeamScores[i]) * scores[i];
                total[1] += Integer.parseInt(homeTeamScores[i]) * scores[i];
            }

            StringBuilder ans = new StringBuilder();
            ans.append(total[0]).append(' ').append(total[1]);

            bw.append(ans);
            bw.close();
            br.close();
        }
    }