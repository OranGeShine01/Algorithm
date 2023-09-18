import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];
        for (int i=0; i<8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        boolean asc = false;
        boolean desc = false;
        for (int i=1; i<8; i++) {
            if (arr[i-1]>arr[i]) {
                if (asc) {
                    System.out.println("mixed");
                    System.exit(0);
                } else desc=true;
            }
            else {
                if (desc) {
                    System.out.println("mixed");
                    System.exit(0);
                } else asc=true;
            }
        }
        if (asc) System.out.println("ascending");
        else System.out.println("descending");

        br.close();
    }
}