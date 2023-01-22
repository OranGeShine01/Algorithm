import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int[] n(int an) {
		
		int[] result = new int[2];
		int stand;
		
		for (int i=1; ; i++) {
			
			stand = (i * (i+1))/2;
			if (an <= stand) {
				
				result[0] = i;
				result[1] = stand - an;
				break;
				
			}			
		}
		
		return result;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		
		if (n(x)[0]%2 == 0) {
			
			System.out.println((n(x)[0]-n(x)[1]) + "/" + (n(x)[1]+1));
			
		} else {
			
			System.out.println((n(x)[1]+1) + "/" + (n(x)[0]-n(x)[1]));
			
		}
		
		

	}

}