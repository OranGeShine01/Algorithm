import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder ans = new StringBuilder();
		
		for (int i=0; i<n; i++) {
			String[] str = br.readLine().split(" ");			
			
			for (int j=0; j<str.length; j++) {
				StringBuilder sb = new StringBuilder(str[j]);
				ans.append(sb.reverse() + " ");
			}
			ans.append("\n");
		}		
		System.out.println(ans);
	}
}
