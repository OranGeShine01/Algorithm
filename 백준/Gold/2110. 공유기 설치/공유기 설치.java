import java.io.*;
import java.util.Arrays;

public class Main {

    static int[] houses;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        houses = new int[n];

        for (int i = 0; i < n; i++) {
            houses[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(houses);

        int start = 1;
        int end = houses[n - 1] - houses[0] + 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (countInstallNumber(mid) < m) end = mid;
            else start = mid + 1;
        }

        bw.append(String.valueOf(start - 1));
        bw.flush();
        bw.close();
        br.close();
    }

//    설치할 수 있는 공유기의 댓수
    static int countInstallNumber(int minDistance) {
        int result = 1;
        int prevHouse = houses[0];
        for (int currentHouse : houses) {
            if (currentHouse - prevHouse >= minDistance) {
                result++;
                prevHouse = currentHouse;
            }
        }
        return result;
    }

}
