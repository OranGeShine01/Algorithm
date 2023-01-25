import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] xy = new int[n][2];
		
		for (int i=0; i<n; i++) {
			String[] arr = (br.readLine()).split(" ");
			xy[i][0] = Integer.parseInt(arr[1]); // y값이 xy의 앞쪽에 들어감.
			xy[i][1] = Integer.parseInt(arr[0]); // x값이 xy의 뒤쪽에 들어감.
		}
		
		//Override
		Arrays.sort(xy, (e1, e2) -> {
			if (e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<n; i++) {
			sb.append(xy[i][1] + " " + xy[i][0] + "\n");
		}
		
		System.out.println(sb);
		

	}

}