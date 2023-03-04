import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int[] ring = new int[n];
		for (int i=0; i<n; i++) {
			ring[i] = Integer.parseInt(st.nextToken());			
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=1; i<n; i++) {
			int gcf = gcf(ring[0], ring[i]);
			sb.append((ring[0]/gcf) + "/" + (ring[i]/gcf) + "\n");
		}
		
		System.out.println(sb);

	}
	
	public static int gcf(int a, int b) {
		if (b==0) return a;
		return gcf(b, a%b);
	} // 최대공약수 구하는 매소드, a>b

}
