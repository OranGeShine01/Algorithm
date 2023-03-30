import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack <Integer>stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int max = 0;
		
		for (int i=0; i<n; i++) {
			int k = Integer.parseInt(br.readLine()); // 입력받은 숫자
			
			if (max<k) {
				for (int j=max+1; j<=k; j++) {
					stack.push(j);
					sb.append("+\n");
				}
				max = k;
			}
			
			if (k==stack.peek()) {
				stack.pop();
				sb.append("-\n");
			} else {
				System.out.println("NO");
				System.exit(0);
			}
		}
		System.out.println(sb);
	}

}
