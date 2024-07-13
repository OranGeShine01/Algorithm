import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int len = str.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        
        int ans = arr[0] * arr[1] + arr[2] * arr[3];
        bw.append(String.valueOf(ans));

        br.close();
        bw.close();
    }
}