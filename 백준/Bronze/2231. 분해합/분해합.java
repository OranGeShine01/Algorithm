import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		boolean cons = false;
		
		for (int i=1; i<n; i++) {
						
			if (divplus(i) == n) {
				
				System.out.println(i);
				cons = true;
				break;
				
			}
			
		}
		
		if (cons == false) {
			
			System.out.println(0);
			
		}
		
		
		

	}
	
	public static int divplus(int n) {
		
		int temp = n;
		ArrayList<Integer> arr = new ArrayList();
		int result = n;
				
		for (int i=0; i<=Math.log10(n); i++) {
			
			arr.add(temp%10);
			temp = temp/10;
			
		}
		
		for (int i=0; i<arr.size(); i++) {
			
			result+=arr.get(i);
			
		}
		
		return result;
		
	}

}