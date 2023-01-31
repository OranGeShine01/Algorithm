import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	// 전체 사람 수
		int[][] list = new int[n][2];	// 각 사람들의 몸무게와 키
		int [] rank = new int[n];		// 각 사람들의 순위
		StringBuilder sb = new StringBuilder();	// 결과값 출력
		
		for (int i=0; i<n; i++) {
			
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			
			list[i][0] = Integer.parseInt(st.nextToken());
			list[i][1] = Integer.parseInt(st.nextToken());
			rank[i] = 1;
			
		}
		
		for (int i=0; i<n-1; i++) {
			
			for (int j=i+1; j<n; j++) {
				
				if (list[i][0] > list[j][0] && list[i][1] > list[j][1]) {
					
					rank[j]++;
					
				} else if (list[i][0] < list[j][0] && list[i][1] < list[j][1]) {
					
					rank[i]++;
					
				}				
			}			
		}
		
		for (int i=0; i<n; i++) {
			
			sb.append(rank[i] + " ");
			
		}
		
		System.out.println(sb);

	}

}