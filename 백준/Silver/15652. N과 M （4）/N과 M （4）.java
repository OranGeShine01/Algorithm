import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int n, m;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	static boolean visit;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		dfs(0, 0);
		System.out.println(sb);
		
	}
	
	static void dfs(int k, int depth) {
		if (depth == m) {
			for (int i : arr) {
				sb.append(i + " ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i=k; i<n; i++) {
			arr[depth] = i+1;
			dfs(i, depth+1);
		}
	}

}
