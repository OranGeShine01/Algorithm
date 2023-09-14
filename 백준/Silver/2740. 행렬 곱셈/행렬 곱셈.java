import java.io.*;
import java.util.StringTokenizer;

public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr1 = new int[n][m];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<m; j++) {
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] arr2 = new int[m][k];
        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<k; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] ans = new int[n][k];
        for (int i=0; i<n; i++) {
            for (int j=0; j<k; j++) {
                for (int o=0; o<m; o++) {
                    ans[i][j]+=(arr1[i][o]*arr2[o][j]);
                }
                bw.append(String.valueOf(ans[i][j])).append(' ');
            }
            bw.append("\n");
        }
        bw.close();
        br.close();
    }

}