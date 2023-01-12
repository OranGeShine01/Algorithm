import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[6];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(1-arr[0] + " ");
		sb.append(1-arr[1] + " ");
		sb.append(2-arr[2] + " ");
		sb.append(2-arr[3] + " ");
		sb.append(2-arr[4] + " ");
		sb.append(8-arr[5]);
		System.out.println(sb);
		
		
	}

}
