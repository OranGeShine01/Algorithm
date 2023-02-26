import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] rf = new int[n]; // real factor
		
		for (int i=0; i<n; i++) {
			rf[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(rf);
		System.out.println(rf[0] * rf[n-1]);

	}

}
