import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack <Character> stack = new Stack<>(); // 연산자를 담을 스택
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (ch=='+' || ch=='-' || ch=='*' || ch=='/') {
				while (!stack.isEmpty() && operater(stack.peek()) >= operater(ch)) {
					sb.append(stack.pop());
				} // 앞선 연산자가 우선순위가 높은 경우 연산을 진행한다.
				stack.push(ch);
			} else if (ch=='(') {
				stack.push(ch); // 괄호를 열었음을 스택에 담아줘서 표시
			} else if (ch==')') {
				while (!stack.isEmpty() && stack.peek() !='(') {
					sb.append(stack.pop());
				} // (A) 같은 형식의 중위표기법을 걸러줘야한다 (Empty Stack 에러방지)
				stack.pop();
			} else {
				sb.append(ch);
			}
		}
		
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		System.out.println(sb);
	}
	
	static int operater(char ch) { // 연산의 우선순위를 정하는 Method
		if (ch=='(' || ch==')') {
			return 0;
		} else if (ch=='+' || ch=='-') {
			return 1;
		} else {
			return 2;
		}
	}
	
	
}
