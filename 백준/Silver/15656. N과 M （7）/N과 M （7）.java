import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int n, m;
	static int[] arr, arr2;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		arr = new int[n];
		arr2 = new int[m];
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		dfs(0);
		System.out.println(sb);
		
		

	}
	
	static void dfs(int depth) {
		if (depth==m) {
			for (int i : arr2) {
				sb.append(i + " ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i=0; i<n; i++) {
				arr2[depth] = arr[i];
				dfs(depth+1);
			}
	}
}
