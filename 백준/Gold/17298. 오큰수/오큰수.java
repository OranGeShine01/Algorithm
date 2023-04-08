import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] a = new int[n];
		Stack<Integer> stack = new Stack<>(); // 배열의 index를 담을 스택.
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(str[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<n; i++) {
			while (!stack.isEmpty() && a[i]>a[stack.peek()]) {
				a[stack.pop()] = a[i]; //현재 배열값이 이전에 스택에 입력된 index의 배열값과 일치하면 해당 배열값을 덮어씌워준다.
			}
			stack.push(i); // 스택에 현재 index 값을 넣어준다.
		}
		
		while (!stack.isEmpty()) {
			a[stack.pop()] = -1; // 스택에 남은 값들은 오큰수가 없어 -1을 대입
		}
		
		for (int i : a) {
			sb.append(i + " "); // 값을 StringBuilder에 담아준다.
		}
		
		System.out.println(sb); // 정답을 출력.
	}

}
