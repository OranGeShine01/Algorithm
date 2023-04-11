import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		Stack<Double> stack = new Stack<>();
		Double[] k = new Double[n];
		
		for (int i=0; i<n; i++) {
			k[i] = Double.parseDouble(br.readLine());
		}
		
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (65<=ch && ch<=90) {
				stack.push(k[ch-65]);
			} else {
				Double a = stack.pop();
				Double b = stack.pop();
				
				if (ch=='*') {
					stack.push(b*a);
				} else if (ch=='/') {
					stack.push(b/a);
				} else if (ch=='+') {
					stack.push(b+a);
				} else if (ch=='-') {
					stack.push(b-a);
				}
			}
		}
		System.out.printf("%.2f", stack.pop());
	}

}
