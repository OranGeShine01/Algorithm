    import java.io.*;
    import java.util.StringTokenizer;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st;

            int[][] arr = new int[100][100];
            int n = Integer.parseInt(br.readLine());
            for (int i=0; i<n; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken())-1;
                int y = Integer.parseInt(st.nextToken())-1;
                for (int j=0; j<10; j++) {
                    for (int k=0; k<10; k++) {
                        arr[x+j][y+k]++;
                    }
                }
            }

            int ans = 0;

            for (int i=0; i<arr.length; i++) {
                for (int j : arr[i]) {
                    if (j>=1) ans++;
                }
            }

            bw.append(String.valueOf(ans));
            bw.close();
            br.close();
        }
    }