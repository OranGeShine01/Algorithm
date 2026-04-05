import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final char health = '*';
        int n = Integer.parseInt(br.readLine());
        StringBuilder ans = new StringBuilder();

        int heartRow = 0;
        int heartCol = 0;
        int[] body = new int[5]; // 0:왼팔, 1:오른팔, 2:허리, 3:왼다리, 4:오른다리
        int legStartLow = 0;

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            board[i] = input.toCharArray();
            if (heartCol == 0 && input.indexOf(health) >= 0) {
                heartRow = i + 1;
                heartCol = input.indexOf(health);
            }
        }

        for (int i = 0; i < heartCol; i++) {
            if (board[heartRow][i] == health) body[0]++;
        }

        for (int i = heartCol + 1; i < n; i++) {
            if (board[heartRow][i] == health) body[1]++;
        }

        for (int i = heartRow + 1; i < n; i++) {
            if (board[i][heartCol] == health) body[2]++;
            else {
                legStartLow = i;
                break;
            }
        }

        for (int i = legStartLow; i < n; i++) {
            if (board[i][heartCol - 1] == health) body[3]++;
            if (board[i][heartCol + 1] == health) body[4]++;
        }

        ans.append(heartRow + 1).append(' ').append(heartCol + 1).append('\n');
        for (int i : body) {
            ans.append(i).append(' ');
        }

        bw.append(ans);
        bw.close();
        br.close();
    }
}