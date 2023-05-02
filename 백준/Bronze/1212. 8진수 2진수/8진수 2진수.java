import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		if (str.equals("0")) {
			sb.append("0"); // 입력값이 0인 경우 그대로 끝.
		} else {
			int first = str.charAt(0)-48; // 8진수 첫 자릿수 값 선언.
			
			// 8진수 첫 자릿수의 2진법 변환시 자릿수를 따져준다.
			if (first>=4) { 
				sb.append(eightToTwo(str.charAt(0))); 
			} else if (first>=2) {
				sb.append(eightToTwo(str.charAt(0)).substring(1));
			} else {
				sb.append("1"); 
			}
			
			for (int i=1; i<str.length(); i++) {
				sb.append(eightToTwo(str.charAt(i)));
			}
		}
		System.out.println(sb);
	}
	
	static String eightToTwo(int ch) {
		StringBuilder sb = new StringBuilder();
		int ch2 = ch-48; // 받은 값은 사실상 char값이므로, int로 변환해준다.
		if (ch2/4!=0) {
			sb.append("1");
			ch2-=4;
		} else {
			sb.append("0");
		}
		
		if (ch2/2!=0) {
			sb.append("1");
			ch2-=2;
		} else {
			sb.append("0");
		}
		
		sb.append(ch2);
		return sb.toString();
	}

}
