import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int[] d = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i=0; i<n; i++) {			
			d[i] = Math.abs(s-Integer.parseInt(st.nextToken()));
		}
		
		Arrays.sort(d);
		int ans = d[0];
		for (int i=1; i<n; i++) {
			ans = gcd(ans, d[i]);
		}
		System.out.println(ans);
	}		

	
	static int gcd(int minor, int major) {
		while (major%minor!=0) {
			int temp = minor;
			minor = major%minor;
			major = temp;
		}
		return minor;
	}

}
