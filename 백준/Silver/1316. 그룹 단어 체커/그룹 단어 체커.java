import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int count = n;
		String str;
		
		
		for (int i=0; i<n; i++) {
			
			str = br.readLine();
			int[] mtcount = new int[26]; // 중복숫자 카운트
			
			mtcount[str.charAt(0)-97]++;
			
			for (int j=0; j<str.length()-1; j++) {
				
				if (str.charAt(j) != str.charAt(j+1)) {
					
					mtcount[str.charAt(j+1)-97]++;
					
				}
				
			}
			
			for (int k=0; k<26; k++) {
				
				
				if (mtcount[k]>=2) {
					
					count--;
					break;
					
				}				
			}			
		}
		
		
		System.out.println(count);
		
		

	}

}