import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		int count = n;
		int stand = 0;
		
		for (int i=0; i<n; i++) {
			
			stand = Integer.parseInt(st.nextToken());
			
			if (stand == 1) {
				
				count--;
				
			}
			
			for (int j=2; j<stand; j++) {
				
				if (stand%j == 0) {
					
					count--;
					break;
					
				} else {
					
				}
				
			}
			
			
		}
		
		System.out.println(count);

	}

}