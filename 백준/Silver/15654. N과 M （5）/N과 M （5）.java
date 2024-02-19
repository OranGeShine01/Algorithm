import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int[] arr, nList;
	static int n, m;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		nList = new int[n];
		visit = new boolean[n];
		arr = new int[m];
		
		for (int i=0; i<nList.length; i++) {
			nList[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(nList);
		dfs(0);
		System.out.println(sb);
		
	}
	
	public static void dfs(int depth) {
		if (depth==m) {
			for (int i : arr) {
				sb.append(i + " ");
			}
			sb.append("\n");
			return;
		} else {
			
			for (int i=0; i<n; i++) {
				if (!visit[i]) {
					visit[i] = true;
					arr[depth] = nList[i];
					dfs(depth+1);
					visit[i] = false;
				}
			}			
		}
	}
}