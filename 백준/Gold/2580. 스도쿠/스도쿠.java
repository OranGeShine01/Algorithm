import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] sdk;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //스도쿠를 담을 배열
        sdk = new int[9][9];
        StringTokenizer st;

        for (int i=0; i<9; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<9; j++) {
                sdk[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sudoku(0, 0);
    }

    // 스도쿠 칸 채우기
    static void sudoku(int x, int y) {

        if (y==9) {
            sudoku(x+1, 0);
            return;
        }

        if (x==9) {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<9; i++) {
                for (int j=0; j<9; j++) {
                    sb.append(sdk[i][j]).append(" ");
                }
                sb.append("\n");
            }
            System.out.println(sb);
            System.exit(0);
        }

        if (sdk[x][y]==0) {
            for (int i=1; i<=9; i++) {
                if (search(x, y, i)) {
                    sdk[x][y] = i;
                    sudoku(x, y+1);
                }
            }
            // 오답인 경우, 기입했던 값을 초기화하고 해당 위치부터 재탐색
            sdk[x][y] = 0;
            return;
        }

        sudoku(x, y+1);
    }

    // 스도쿠의 값을 찾아 입력가능한지를 판단하는 method
    static boolean search(int x, int y, int value) {

        for (int i=0; i<9; i++) {
            // 같은 열에서 숫자가 반복되면 안 된다.
            if (sdk[i][y]==value) {
                return false;
            }
            // 같은 행에서 숫자가 반복되면 안 된다.
            else if (sdk[x][i]==value) {
                return false;
            }
        }

        // 3*3 정사각형을 따질때 필요한 수들 (반복문에 들어가면 반복하므로, 여기서 미리 만들어줌)
        int a = x/3*3;
        int b = y/3*3;

        // 3x3 정사각형 안에서도 숫자가 반복되면 안된다.
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (sdk[a+i][b+j]==value) {
                    return false;
                }
            }
        }

        // 이 외에는 입력 가능.
        return true;
    }
}