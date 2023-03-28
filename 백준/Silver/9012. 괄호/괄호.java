import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		boolean[] ans = new boolean[n];
		//no면 true, yes면 false를 반환
		
		for (int i=0; i<n; i++) {
			String str = br.readLine();
			int[] count = new int[2];
			for (int j=0; j<str.length(); j++) {				
				if (str.charAt(j)=='(') {
					count[0]++;
				} else if (str.charAt(j)==')') {
					count[1]++;
				}
				if (count[0]<count[1]) {
					ans[i] = true;
					break;
				}				
			}
						
			if (count[0]!=count[1] || ans[i]) {
				sb.append("NO\n");
			} else {
				sb.append("YES\n");
			}
		}
		System.out.println(sb);
	}
}
