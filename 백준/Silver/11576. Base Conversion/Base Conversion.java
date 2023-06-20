import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		Stack <Integer> stack = new Stack<>();
		
		int[] digit = new int[m]; // A진법의 각 자리별 숫자를 배열로 받음. 앞부터 높은자릿수.
		int realA = 0; // A진법으로 받은 숫자를 10진법으로 나타낸 수.
		for (int i=0; i<m; i++) {
			digit[i] = Integer.parseInt(st.nextToken());
			realA+=(int)(Math.pow(a, m-i-1))*digit[i];
		} // A진법으로 받은 숫자를 10진법으로 변환.
		while (realA!=0) {			
			stack.push(realA%b);
			realA/=b;
		}
		
		int n = stack.size();
		StringBuilder sb = new StringBuilder();
		
		while (!stack.isEmpty()) {
			sb.append(stack.pop() + " ");
		}
		System.out.println(sb);
	}
}