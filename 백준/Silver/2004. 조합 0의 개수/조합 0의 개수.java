import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int ans1 = five(n) - five(n-m) - five(m);
		int ans2 = two(n) - two(n-m) - two(m);
		System.out.println(Math.min(ans1, ans2));
				
	}
	
	static int five(int n) {
		int count = 0;
		while (n>=5) {
			count += n/5;
			n /= 5;
		}
		return count;
	}
	
	static int two(int n) {
		int count = 0;
		while (n>=2) {
			count += n/2;
			n /= 2;
		}
		return count;
	}
}