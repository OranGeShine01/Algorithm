import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // 2진수를 우선 문자열로 받아온다.
		if (str.length()%3==1) { // 계산을 위해, 3단위로 끊어줘야 하므로 자릿수를 맞춰주기 위해 0을 추가
			str = "00"+str; 
		} else if (str.length()%3==2) {
			str = "0"+str;
		}
		System.out.println(conversion(str));
	}
	
	static StringBuilder conversion(String str) {
		int n = str.length()/3; // 8진법으로 변환시 자릿수
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<n; i++) {
			sb.append(4*(str.charAt(i*3)-48) + 2*(str.charAt(i*3+1)-48) + str.charAt(i*3+2)-48);			
		}
		return sb;
	}

}
