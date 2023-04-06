import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack <Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		boolean tag = false;
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (ch=='<') {
				while (!stack.isEmpty()) {
					sb.append(stack.peek());
					stack.pop();
				}
				tag = true;
				sb.append('<');
			} else if (ch==' ') {
				while (!stack.isEmpty()) {
					sb.append(stack.peek());
					stack.pop();
				}
				sb.append(' ');
			} else if (ch=='>') {
				tag = false;
				sb.append('>');
			} else if (tag) {
				sb.append(ch);
			} else {
				stack.push(ch);
			} 
			
			if (i==str.length()-1) {
				while (!stack.isEmpty()) {
					sb.append(stack.peek());
					stack.pop();
				}
			}
		}
		System.out.println(sb);
	}

}
