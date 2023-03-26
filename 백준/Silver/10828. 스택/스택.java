import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<n; i++) {
			String str = br.readLine();
			if (str.substring(0,3).equals("pus")) {
				String[] arr = str.split(" ");
				stack.push(Integer.parseInt(arr[1]));				
			} else if (str.equals("pop")) {
				if (stack.size()!=0) {
					sb.append(stack.pop() + "\n");
				} else {
					sb.append("-1\n");
				}
			} else if (str.equals("size")) {
				sb.append(stack.size() + "\n");
			} else if (str.equals("empty")) {
				if (stack.empty()) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
			} else if (str.equals("top")) {
				if (stack.size()!=0) {
					int top = stack.pop();
					stack.push(top);
					sb.append(top + "\n");
				} else {
					sb.append("-1\n");					
				}
			}
		}
		
		System.out.println(sb);
	}
}
