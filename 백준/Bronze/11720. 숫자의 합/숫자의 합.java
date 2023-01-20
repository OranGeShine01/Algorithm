import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
			
			String m = br.readLine();
			for (int j=0; j<n; j++) {
						
				sum = sum + Integer.parseInt(String.valueOf(m.charAt(j)));
				
			}
			
			System.out.println(sum);
			sum = 0;
			
		
		
		

	}

}