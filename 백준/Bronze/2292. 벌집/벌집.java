import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
				
		for (int i=1; ; i++) {
			
			if (n<= 3*Math.pow(i, 2)-3*i + 1) {
				
				System.out.println(i);
				break;
				
			}
			
		}
		
		

	}

}