import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int n, m;
    static int[][] arr;
    static int[][] ps;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][n];
        ps = new int[n+1][n+1];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int count = 0;
            for (int j=0; j<n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                count+=arr[i][j];
                ps[i+1][j+1] = ps[i][j+1] + count;
            }
        }

        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int[][] xy = new int[2][2]; // x1, y1, x2, y2의 좌표배열
            xy[0][0] = Integer.parseInt(st.nextToken());
            xy[0][1] = Integer.parseInt(st.nextToken());
            xy[1][0] = Integer.parseInt(st.nextToken());
            xy[1][1] = Integer.parseInt(st.nextToken());
            int ans = ps[xy[1][0]][xy[1][1]] - ps[xy[0][0]-1][xy[1][1]] - ps[xy[1][0]][xy[0][1]-1] + ps[xy[0][0]-1][xy[0][1]-1];
            bw.append(String.valueOf(ans)).append("\n");
        }

        bw.close();
        br.close();
    }
}