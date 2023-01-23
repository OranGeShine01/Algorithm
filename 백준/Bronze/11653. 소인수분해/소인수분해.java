import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int temp = n;
		int i=2;
		
		while (temp != 1) {
						
			if (temp%i == 0) {
				
				temp = temp/i;
				System.out.println(i);
				
			} else {
				
				i++;
				
			}
			
		}
		
		

	}

}