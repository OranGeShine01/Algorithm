import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
				
		int t = Integer.parseInt(br.readLine());
		int r; String s;
		
		for (int i=0; i<t; i++) {
			
			String rs = br.readLine();
			st = new StringTokenizer(rs);
			r = Integer.parseInt(st.nextToken());
			s = st.nextToken();
			
			for (int j=0; j<s.length(); j++) {
				
				for (int k=0; k<r; k++) {
					
					sb.append(s.charAt(j));
					
				}
				
			}
			
			System.out.println(sb);
			sb.setLength(0);
			
		}
		

	}

}