import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		st = new StringTokenizer(str);
		int arr[] = new int[n];
		
		int max = 0;
		double sum = 0;
		double arr2[] = new double[n];
		double ans;
		
		
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int j=0; j<n; j++) {
			if (max < arr[j]) {
				max = arr[j];
			}
		}
		
		for (int k=0; k<n; k++) {
			
			arr2[k] = (double)arr[k]*100/max;
			sum = sum + arr2[k];
			
		}
		
		ans = sum/n;
				
		System.out.println(ans);

	}

}