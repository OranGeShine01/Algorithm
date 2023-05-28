import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		char[] radix = new char[36]; // 진법 각 자릿수를 표기할 배열
		for (int i=0; i<=9; i++) {
			radix[i]=(char) (i+48);
		} // 0부터 9까지는 그대로
		for (int i=10; i<=35; i++) {
			radix[i]=(char) (i+55);
		} // 10부터 35까지는 A~Z
		
		StringBuilder sb = new StringBuilder();
		if (n==0) {
			System.out.println(0);
		} else {
			while (n!=0) {
				sb.insert(0, radix[n%b]);
				n/=b;				
			}
			System.out.println(sb);
		}
	}
}
