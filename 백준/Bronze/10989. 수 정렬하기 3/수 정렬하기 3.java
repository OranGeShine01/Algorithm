import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());			
		}
		
		Arrays.sort(arr);
		
		for (int i=0; i<n; i++) {
			sb.append(arr[i]+"\n");
		}
		
		System.out.println(sb);
	}
}