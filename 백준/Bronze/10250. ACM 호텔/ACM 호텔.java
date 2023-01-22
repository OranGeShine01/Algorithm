import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		String str;
		String[] str2;
		int ho;
		int floor;
		
		
		for (int i=0; i<t; i++) {
			
			str = br.readLine();
			str2 = str.split(" ");
			
			if (Integer.parseInt(str2[2])%Integer.parseInt(str2[0]) == 0) {
				
				ho = Integer.parseInt(str2[2])/Integer.parseInt(str2[0]);
				floor = Integer.parseInt(str2[0]);
				
			} else {
				
				ho = Integer.parseInt(str2[2])/Integer.parseInt(str2[0]) + 1;
				floor = Integer.parseInt(str2[2])%Integer.parseInt(str2[0]);
				
			}
				
			
			
			
			if (ho<10) {
				
				System.out.println(String.valueOf(floor) + "0" + String.valueOf(ho));
				
			} else {
				
				System.out.println(String.valueOf(floor) + String.valueOf(ho));
				
			}
			
			
		} 
		

	}

}