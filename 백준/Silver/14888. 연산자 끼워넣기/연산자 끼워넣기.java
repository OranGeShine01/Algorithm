import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int n; // 수의 개수
    static int[] arr; // 수열을 담은 배열
    static int[] oper = new int[4]; // 사칙연산 배열, + - * / 순.
    static int max = Integer.MIN_VALUE; // 최대값
    static int min = Integer.MAX_VALUE; // 최소값
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 숫자의 갯수 n 확정
        n = Integer.parseInt(br.readLine());

        // 배열에 수열을 담기
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 연산자의 갯수 입력
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<4; i++) {
            oper[i] = Integer.parseInt(st.nextToken());
        }

        search(arr[0], 1);
        System.out.println(max);
        System.out.println(min);
    }

    public static void search(int a, int index) {
        if (index == n) {
            max = Math.max(max, a);
            min = Math.min(min, a);
            return;
        }

        for (int i=0; i<4; i++) {
            if (oper[i]>0) {
                oper[i]--; // 해당 index 연산자의 잔여분을 1 감소

                switch (i) {
                    case 0 : search(a+arr[index], index+1); break;
                    case 1 : search((a-arr[index]), index+1); break;
                    case 2 : search((a*arr[index]), index+1); break;
                    case 3 : search((a/arr[index]), index+1); break;
                }
                oper[i]++;
            }
        }
    }
}