import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int max = 0; int min = 0;
		
		String str[] = br.readLine().split(" ");
		
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		} // 배열에 값 입력받기
		
		max = arr[0];	min = arr[0];
		
		for (int j=1; j<n; j++) {
			if (max<arr[j]) {
				max = arr[j];
			}
			if (min>arr[j]) {
				min = arr[j];
			}
		}
		System.out.println(min + " " + max);
	}

}