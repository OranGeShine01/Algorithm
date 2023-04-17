import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		while ((str = br.readLine())!=null) {
			
			StringBuilder sb = new StringBuilder();
			
			int[] ans = new int[4]; // 소문자, 대문자, 숫자, 공백의 개수를 받을 정답배열
			
			for (int i=0; i<str.length(); i++) {
								
				char ch = str.charAt(i);
				if ('a'<=ch && ch<='z') {
					ans[0]++;
				} else if ('A'<=ch && ch<='Z') {
					ans[1]++;
				} else if ('0'<=ch && ch<='9') {
					ans[2]++;
				} else if (ch==' ') {
					ans[3]++;
				}
			}
			for (int i : ans) {
				sb.append(i + " ");
			}
			System.out.println(sb);
		}

	}

}
