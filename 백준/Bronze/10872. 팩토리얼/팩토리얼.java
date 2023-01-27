import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static long fact (int num) {
				
		if (num <= 1) {
			
			return 1;
			
		} else {
						
			return num * fact(num-1);
			
		}
		
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long sum = fact(n);
	
		System.out.println(sum);

	}

}