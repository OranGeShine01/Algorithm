import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str1 = br.readLine();
		String[] str2 = str1.split(" ");
		int[] x = new int[n]; // 원본배열
		int[] x2 = new int[n]; // 정렬배열
		HashMap<Integer, Integer> ranking = new HashMap<>();
		
		int rank = 0;
		
		for (int i=0; i<n; i++) {
			x[i] = Integer.parseInt(str2[i]);
			x2[i]=x[i];
		}
		
		Arrays.sort(x2);
		
		for (int i : x2) {
			
			if(!ranking.containsKey(i)) {
				ranking.put(i, rank);
				rank++;
			}			
		}
				
		StringBuilder sb = new StringBuilder();
		
		for (int i : x) {
			int rank2 = ranking.get(i);
			sb.append(rank2 + " ");
		}
				
		System.out.println(sb);
	}

}