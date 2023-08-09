import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    static int[][] input; // 각 전선들의 배열
    static int n; // 전깃줄의 갯수
    static Integer count[]; // 각 전깃줄 별로 최소 설치갯수를 측정

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        input = new int[n][2];
        count = new Integer[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            input[i][0] = Integer.parseInt(st.nextToken());
            input[i][1] = Integer.parseInt(st.nextToken());
        }

        //arrays.sort를 override하여 2차원배열 정렬
        Arrays.sort(input, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });

        int max = 1; // 전깃줄 갯수의 최대값
        for (int i = 0; i < n; i++) {
            max = Math.max(max, count(i));
        }

        System.out.println(n - max);
    }

    // k번째 전깃줄이 설치되었을때, 설치할 수 있는 전깃줄의 최대 갯수
    static int count(int k) {

        // 초기화
        if (count[k] == null) {
            count[k] = 1;

            for (int i = k - 1; i >= 0; i--) {
                if (input[k][1] > input[i][1]) {
                    count[k] = Math.max(count[k], count(i) + 1);
                }
            }
        }
        return count[k];
    }
}