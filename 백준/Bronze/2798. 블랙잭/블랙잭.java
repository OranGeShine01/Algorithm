import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		ArrayList<Integer> arr = new ArrayList();
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		int[] card = new int[n];
		int max;
		
		for (int i=0; i<n; i++) {
			
			card[i] = Integer.parseInt(st2.nextToken());
			
		}
		
		for (int i=0; i<n-2; i++) {
			
			for (int j=i+1; j<n-1; j++) {
				
				for (int k=j+1; k<n; k++) {
					
					int l = card[i] + card[j] + card[k];
										
					if (l<=m) {
						
						arr.add(l);
						
					}					
				}				
			}			
		}
		
		max = arr.get(0);
		
		for (int i=0; i<arr.size(); i++) {
			
			if (max < arr.get(i)) {
				
				max = arr.get(i);
				
			}
			
		}
		
		System.out.println(max);

	}

}