import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int n, m;
	static boolean[] visit;
	static int[] arr;
	static int depth;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		visit = new boolean[n];
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
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i+1;
				dfs(i, depth+1);
				visit[i] = false;
			}
			
		}
	}

}
