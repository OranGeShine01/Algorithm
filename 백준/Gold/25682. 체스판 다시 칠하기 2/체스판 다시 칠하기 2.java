import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[][] arr = new boolean[m][n]; // M*N 크기의 전체보드, W=true, B=false
        // 전체보드에서 x, y좌표까지의 다시칠해야하는 정사각형 갯수, 시작점이 W인 경우와 B인 경우 2가지로 분류.
        int[][][] ps = new int[2][m+1][n+1];
        // 전체 보드에서 배치가 잘못된 숫자를 누적합으로 ps를 구해준다.
        for (int i=0; i<n; i++) {
            int[] count = new int[2];
            String str = br.readLine();
            for (int j=0; j<m; j++) {
                char ch = str.charAt(j);
                if (ch=='W') {
                    if ((i+j)%2==0) {
                        count[1]++;
                    } else {
                        count[0]++;
                    }
                } else {
                    if ((i+j)%2==0) {
                        count[0]++;
                    } else {
                        count[1]++;
                    }
                }
                ps[0][j+1][i+1] = count[0] + ps[0][j+1][i];
                ps[1][j+1][i+1] = count[1] + ps[1][j+1][i];
            }
        }

        int min = Integer.MAX_VALUE;
        //(i, j)에서 (i+k, j+k)까지의 누적합 중 최솟값을 구한다.
        for (int i=1; i<=m-k+1; i++) {
            for (int j=1; j<=n-k+1; j++) {
                int w = ps[0][i+k-1][j+k-1] - ps[0][i-1][j+k-1] - ps[0][i+k-1][j-1] + ps[0][i-1][j-1];
                int b = ps[1][i+k-1][j+k-1] - ps[1][i-1][j+k-1] - ps[1][i+k-1][j-1] + ps[1][i-1][j-1];
                min = Math.min(min, Math.min(w, b));
            }
        }

        bw.append(String.valueOf(min));

        bw.close();
        br.close();
    }
}