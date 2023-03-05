import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] input; // 입력값을 받는 배열
    static Integer[] ascFront; // 앞에서부터 오름차순 메모이제이션을 할 배열
    static Integer[] descFront; // 앞에서부터 내림차순 메모이제이션을 할 배열
    static Integer[] ascEnd; // 뒤에서부터 오름차순 메모이제이션을 할 배열
    static Integer[] descEnd; // 뒤에서부터 내림차순 메모이제이션을 할 배열
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        input = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        ascFront = new Integer[n];
        ascEnd = new Integer[n];
        descFront = new Integer[n];
        descEnd = new Integer[n];
        ascFront[0] = 1;
        descFront[0] = 1;
        ascEnd[n-1] = 1;
        descEnd[n-1] = 1;
        int max = 1; // 최대길이, 기본값 1로 초기화.
        for (int i=0; i<n; i++) {
            max = Math.max(Math.max(ascFront(i) + descEnd(i) - 1, descFront(i) + ascEnd(i) -1), max);
        }
        System.out.println(max);
    }

    static int ascFront(int k) {
        if (ascFront[k]==null) {
            ascFront[k] = 1; // 초기화
            for (int i=k-1; i>=0; i--) {
                if (input[k]>input[i]) {
                    ascFront[k] = Math.max(ascFront[k], ascFront(i)+1);
                }
            }
        }
        return ascFront[k];
    }

    static int descFront(int k) {
        if (descFront[k]==null) {
            descFront[k] = 1; // 초기화
            for (int i=k-1; i>=0; i--) {
                if (input[k]<input[i]) {
                    descFront[k] = Math.max(ascFront[k], descFront(i)+1);
                }
            }
        }
        return descFront[k];
    }

    static int ascEnd(int k) {
        if (ascEnd[k] == null) {
            ascEnd[k] = 1; // 초기화
            for (int i=k+1; i<n; i++) {
                if (input[k]>input[i]) {
                    ascEnd[k] = Math.max(ascEnd[k], ascEnd(i) + 1);
                }
            }
        }
        return ascEnd[k];
    }

    static int descEnd(int k) {
        if (descEnd[k] == null) {
            descEnd[k] = 1; // 초기화
            for (int i=k+1; i<n; i++) {
                if (input[k]<input[i]) {
                    descEnd[k] = Math.max(descEnd[k], ascEnd(i) + 1);
                }
            }
        }
        return descEnd[k];
    }

}