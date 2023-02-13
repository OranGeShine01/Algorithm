import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		HashMap <String, Integer> map = new HashMap<>();
		
		for (int i=0; i<n; i++) {
			map.put(br.readLine(), 1);
		}
		
		List <String> ans = new ArrayList();
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<m; i++) {
			String bo = br.readLine();
			map.put(bo, map.getOrDefault(bo, 0)+1);
			if (map.get(bo)==2) {
				ans.add(bo);
			}			
		}
		
		Collections.sort(ans);
		System.out.println(ans.size());
		
		for (int i=0; i<ans.size(); i++) {
			sb.append(ans.get(i) + "\n");
		}
		
		System.out.println(sb);
			
	}

}