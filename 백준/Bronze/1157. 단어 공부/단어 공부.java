import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] count = new int[26];
		String str = br.readLine();
		int maxcount = 0;
		int max = 0;
		int multicount = 0;
		
		for (int i=0; i<str.length(); i++) {
			
			for (int j=0; j<26; j++) {
			
				if (str.charAt(i) == (65+j)) {
				
					count[j]++;
				
				} else if (str.charAt(i) == (97+j)) {
					
					count[j]++;
					
				}				
			}			
		}
		
		for (int k=0; k<26; k++) {
			
				
				if (count[k]>maxcount) {
					
					maxcount = count[k];
					max = k;
					
				}				
		}
		
		for (int l=0; l<26; l++) {
			
			if (count[l] == maxcount) {
				
				multicount++;
				
			}
			
		}
		
		if (multicount >= 2) {
			
			System.out.println("?");
			
		} else {
		
		System.out.println((char)(65+max));
		
		}
	}
}
