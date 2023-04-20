import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder ans = new StringBuilder();
		
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (ch==' ') {
				ans.append(ch);
			} else if ('0'<=ch && ch<='9') {
				ans.append(ch);
			} else if ('a'<=ch && ch<='m') {
				ans.append((char)(ch+13));
			} else if ('A'<=ch && ch<='M') {
				ans.append((char)(ch+13));
			} else if ('n'<=ch && ch<='z') {
				ans.append((char)(ch-13));
			} else if ('N'<=ch && ch<='Z') {
				ans.append((char)(ch-13));
			}
		}
		System.out.println(ans);
	}

}
