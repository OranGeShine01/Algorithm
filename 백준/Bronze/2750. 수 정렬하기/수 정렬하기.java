import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); //수의 개수		
		int[] arr = new int[n];	// 수를 담아둘 배열
		
		for (int i=0; i<n; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
			
		}
		
		for (int i=0; i<n-1; i++) {
			
			for (int j=i+1; j<n; j++) {
				
				if (arr[i] > arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
				
			}
			
		}
		
		for (int i=0; i<n; i++) {
			
			System.out.println(arr[i]);
			
		}
	}
}