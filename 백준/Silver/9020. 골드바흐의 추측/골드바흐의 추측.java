import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
			
			int n = Integer.parseInt(br.readLine());
			int m = n/2;
			
			for (int j=0; j<m; j++) {
				
				if (primenumber()[(m-j)] == false && primenumber()[(m+j)] == false) {
					
					System.out.println((m-j) + " " + (m+j));
					break;
					
				}
				
			}
			
		}
					
		
	}
	
	public static boolean[] primenumber() {
				
		boolean pn[] = new boolean[10001];
		// pn이 false면 소수, true면 소수아님
		
		for (int i=0; i<=100; i++) {
			
			if (i <= 1) {
				
				pn[i] = true;
				continue;
				
			}
			
			for (int j=i*i; j<=10000; j+=i) {
				
				pn[j] = true;
				
			}
			
						
		}
				
		return pn;	
		
	}

}