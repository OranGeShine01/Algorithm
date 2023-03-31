import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int m = Integer.parseInt(br.readLine());
		Stack <Character> leftstack = new Stack<>();
		Stack <Character> rightstack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<str.length(); i++) {
			leftstack.push(str.charAt(i));
		}
		
		for (int i=0; i<m; i++) {
			str = br.readLine();
			char msg = str.charAt(0);
			if (msg=='L' && !leftstack.isEmpty()) {
				rightstack.push(leftstack.peek());
				leftstack.pop();
			} else if (msg=='D' && !rightstack.isEmpty()) {
				leftstack.push(rightstack.peek());
				rightstack.pop();
			} else if (msg=='B' && !leftstack.isEmpty()) {
				leftstack.pop();
			} else if (msg=='P') {
				leftstack.push(str.charAt(2));
			}
		}
		
		for (int i=0; i<leftstack.size(); i++) {
			sb.append(leftstack.get(i));
		}
		for (int i=rightstack.size()-1; i>=0; i--) {
			sb.append(rightstack.get(i));
		}
		
		System.out.println(sb);

	}

}
