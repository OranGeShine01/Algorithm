import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] ans = new int[26];
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			ans[ch-97]++;
		}
		
		for (int i : ans) {
			sb.append(i + " ");
		}
		
		System.out.println(sb);
	}

}
