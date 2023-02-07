import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int n, m;
	static int[] ncard;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ncard = new int[n];
		
		for (int i=0; i<n; i++) {
			ncard[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(ncard);
				
		m = Integer.parseInt(br.readLine());
		
		
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<m; i++) {
			int mcard = Integer.parseInt(st.nextToken());
			sb.append(binarySearch(mcard) + " ");
		}
		
		System.out.println(sb);
		
	}
	
	static int binarySearch(int mcard) {
		
		int lIndex = 0;
		int rIndex = ncard.length-1;
		
		while (lIndex <= rIndex) {
			int avg = (lIndex + rIndex) / 2;
			int mid = ncard[avg];
			
			if (mcard < mid) {
				rIndex = avg-1;
			} else if (mcard > mid) {
				lIndex = avg+1;
			} else return 1;
		}
		
		return 0;
	}

}