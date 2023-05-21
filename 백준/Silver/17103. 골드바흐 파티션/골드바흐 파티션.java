import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			int half = n/2;
			int count = 0;
			boolean[] pn = pn(n);
			for (int j=0; j<half; j++) {
				if (!pn[half-j] && !pn[half+j]) {
					count++;
				}
			}
			sb.append(count + "\n");
		}
		System.out.println(sb);
	}
	
	// 에라토스테네스의 체를 구현할 매소드
	static boolean[] pn(int n) {
		boolean[] pm = new boolean[n+1]; // 소수여부를 판별할 배열. true면 소수 아님.
		
		pm[0] = true;
		pm[1] = true;
		
		for (int i=2; i<=Math.sqrt(n); i++) {
			
			if (pm[i]) {
				continue;
			}
			
			for (int j=i*i; j<n+1; j+=i) {
				pm[j] = true;
			}
		}
		return pm;
	}
	
	

}
