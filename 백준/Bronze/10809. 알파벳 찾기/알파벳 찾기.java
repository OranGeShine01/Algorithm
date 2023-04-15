import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char ch;
		String str = br.readLine();
		int[] count = new int[26];
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<26; i++) {
			
			count[i] = str.indexOf(97+i);
			sb.append(count[i] + " ");
			
		}
		
		System.out.println(sb);

	}

}