import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] a = new int[n];
		Map<Integer, Integer> map = new HashMap<>(); // map 자료형으로 각 숫자값의 등장횟수를 count.
		Stack<Integer> stack = new Stack<>(); // 배열의 index를 담을 스택.
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(str[i]);
			map.put(a[i], map.getOrDefault(a[i], 0)+1); // 맵에 각 숫자별 카운트를 넣어준다.
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<n; i++) {
			while (!stack.isEmpty() && map.get(a[i])>map.get(a[stack.peek()])) {
				a[stack.pop()] = a[i];
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
