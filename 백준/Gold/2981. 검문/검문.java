import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		// 각 차이값의 최대공약수를 구한다.
		int gcd = arr[1] - arr[0];				
		for (int i=2; i<n; i++) {
			gcd = gcd(gcd, arr[i]-arr[i-1]);
		}
		
		// 최대공약수의 약수들을 오름차순으로 나열하여 출력.
		for (int i=2; i<=gcd/2; i++) {
			if (gcd%i==0) {
				sb.append(i + " ");
			}			
		}
		sb.append(gcd);
		System.out.println(sb);
	}
	
	// 최대공약수 구하는 매소드. a<b라고 가정.
	static int gcd (int a, int b) {		
		while (b%a!=0) {
			int temp = a;
			a = b%a;
			b = temp;						
		}
		return a;
	}

}
