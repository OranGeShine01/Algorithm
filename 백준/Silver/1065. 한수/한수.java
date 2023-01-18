import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		int[] arr = new int[3];
		
		for (int i=1; i <= n; i++) {
			
			if (i<100) {
				
				count++;
				
			} else if (i<1000) {
				
				for (int j=0; j<arr.length; j++) {
					
					arr[j] = i%(int)(Math.pow(10, j+1))/(int)(Math.pow(10, j));
										
				}
				
				if (arr[0]-arr[1] == arr[1]-arr[2]) {
					
					count++;
					
				}
				
			}
			
		}
		
		System.out.println(count);
		
	}	
}