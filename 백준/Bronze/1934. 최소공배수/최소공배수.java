import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			System.out.println(lcm(x,y));
		}
	}
	
	static int gcd(int x, int y) {
		if (x>y) {
			int temp = x;
			x = y;
			y = temp;
		}
		if (x==0) return y;
		return gcd(y%x, x);
	}
	
	static int lcm(int x, int y) {
		return (x * y) / gcd(x,y);
	}

}