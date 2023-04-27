import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
				
		for (int i=0; i<t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int n = Integer.parseInt(st.nextToken());
			int[] k = new int[n]; // 각 값을 넣을 배열 생성
			long ans = 0; // 출력하게 될 각 줄의 정답값
			for (int j=0; j<n; j++) {
				k[j] = Integer.parseInt(st.nextToken());
			}
			for (int j=0; j<n-1; j++) {
				for (int l=j+1; l<n; l++) {
					ans+=gcd(k[j], k[l]);
				}
			}
			sb.append(ans + "\n");
		}
		System.out.println(sb);
	}
	
	public static int gcd (int minor, int major) {
		int a=minor;
		int b=major;
		while (b%a!=0) {
			int temp = a;
			a = b%a;
			b = temp;			
		}
		
		return a;
	}

}
