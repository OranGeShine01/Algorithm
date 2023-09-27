import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            String str = br.readLine();
            bw.append(str.charAt(0)).append(str.charAt(str.length()-1)).append('\n');
        }

        bw.flush();
        bw.close();
        br.close();

    }


}